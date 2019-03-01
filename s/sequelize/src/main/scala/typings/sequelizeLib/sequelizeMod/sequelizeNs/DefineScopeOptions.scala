package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for Define Scope Options
  *
  * @see DefineOptions
  */
trait DefineScopeOptions
  extends /**
  * Name of the scope and it's query
  */
/* scopeName */ org.scalablytyped.runtime.StringDictionary[AnyFindOptions | js.Function]

object DefineScopeOptions {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Name of the scope and it's query
    */
  /* scopeName */ org.scalablytyped.runtime.StringDictionary[AnyFindOptions | js.Function] = null
  ): DefineScopeOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DefineScopeOptions]
  }
}

