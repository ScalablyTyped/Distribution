package typings
package sanctuaryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: java.lang.String
  var namespace: sanctuaryLib.sanctuaryMod.Maybe[java.lang.String]
  var version: NonNegativeInteger
}

object Anon_Name {
  @scala.inline
  def apply(
    name: java.lang.String,
    namespace: sanctuaryLib.sanctuaryMod.Maybe[java.lang.String],
    version: NonNegativeInteger
  ): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name, namespace = namespace, version = version)
  
    __obj.asInstanceOf[Anon_Name]
  }
}

