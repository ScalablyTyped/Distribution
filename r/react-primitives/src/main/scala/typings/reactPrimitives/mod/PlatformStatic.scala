package typings.reactPrimitives.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformStatic extends js.Object {
  var OS: PlatformOSType
  var Version: Double | String
  @JSName("select")
  def select_default[T](
    specifics: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ platform in react-primitives.react-primitives.PlatformOSType | 'default' ]:? T}
    */ typings.reactPrimitives.reactPrimitivesStrings.PlatformStatic with js.Any
  ): T
}

object PlatformStatic {
  @scala.inline
  def apply(
    OS: PlatformOSType,
    Version: Double | String,
    select: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ platform in react-primitives.react-primitives.PlatformOSType | 'default' ]:? T}
    */ typings.reactPrimitives.reactPrimitivesStrings.PlatformStatic with js.Any => js.Any
  ): PlatformStatic = {
    val __obj = js.Dynamic.literal(OS = OS.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any], select = js.Any.fromFunction1(select))
  
    __obj.asInstanceOf[PlatformStatic]
  }
}

