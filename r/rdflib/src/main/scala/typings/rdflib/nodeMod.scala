package typings.rdflib

import typings.rdflib.typesMod.FromValueReturns
import typings.rdflib.typesMod.ValueType
import typings.std.Date
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib/lib/node", JSImport.Namespace)
@js.native
object nodeMod extends js.Object {
  @js.native
  abstract class default protected ()
    extends typings.rdflib.nodeInternalMod.default {
    protected def this(value: String) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def fromValue[T /* <: FromValueReturns[_] */](value: ValueType): T = js.native
    def toJS(term: js.Any): Date | Number | String | Boolean | js.Object | (js.Array[Date | Number | String | Boolean | js.Object]) = js.native
  }
  
}

