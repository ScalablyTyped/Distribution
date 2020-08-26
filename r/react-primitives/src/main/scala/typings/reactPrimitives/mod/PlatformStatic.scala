package typings.reactPrimitives.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformStatic extends js.Object {
  var OS: PlatformOSType = js.native
  var Version: Double | String = js.native
  @JSName("select")
  def select_default[T](
    specifics: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ platform in react-primitives.react-primitives.PlatformOSType | 'default' ]:? T}
    */ typings.reactPrimitives.reactPrimitivesStrings.PlatformStatic with TopLevel[js.Any]
  ): T = js.native
}

object PlatformStatic {
  @scala.inline
  def apply(
    OS: PlatformOSType,
    Version: Double | String,
    select: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ platform in react-primitives.react-primitives.PlatformOSType | 'default' ]:? T}
    */ typings.reactPrimitives.reactPrimitivesStrings.PlatformStatic with TopLevel[js.Any] => js.Any
  ): PlatformStatic = {
    val __obj = js.Dynamic.literal(OS = OS.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any], select = js.Any.fromFunction1(select))
    __obj.asInstanceOf[PlatformStatic]
  }
  @scala.inline
  implicit class PlatformStaticOps[Self <: PlatformStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOS(value: PlatformOSType): Self = this.set("OS", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double | String): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelect(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ platform in react-primitives.react-primitives.PlatformOSType | 'default' ]:? T}
      */ typings.reactPrimitives.reactPrimitivesStrings.PlatformStatic with TopLevel[js.Any] => js.Any
    ): Self = this.set("select", js.Any.fromFunction1(value))
  }
  
}

