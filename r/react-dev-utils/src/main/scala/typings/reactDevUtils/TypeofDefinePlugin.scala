package typings.reactDevUtils

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.webpack.AnonModule
import typings.webpack.mod.DefinePlugin
import typings.webpack.mod.DefinePlugin.CodeValueObject
import typings.webpack.mod.DefinePlugin.CodeValuePrimitive
import typings.webpack.mod.DefinePlugin.RuntimeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofDefinePlugin extends Instantiable1[/* definitions */ StringDictionary[CodeValueObject], DefinePlugin] {
  def runtimeValue(fn: js.Function1[/* hasModule */ AnonModule, CodeValuePrimitive]): RuntimeValue = js.native
  def runtimeValue(
    fn: js.Function1[/* hasModule */ AnonModule, CodeValuePrimitive],
    fileDependencies: js.Array[String]
  ): RuntimeValue = js.native
}

