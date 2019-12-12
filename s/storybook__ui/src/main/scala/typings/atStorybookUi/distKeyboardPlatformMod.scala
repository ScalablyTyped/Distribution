package typings.atStorybookUi

import org.scalablytyped.runtime.TopLevel
import typings.atStorybookUi.atStorybookUiNumbers.`false`
import typings.atStorybookUi.distKeyboardPlatformMod.OperatingSystem
import typings.atStorybookUi.distKeyboardPlatformMod.OperatingSystem.Linux
import typings.atStorybookUi.distKeyboardPlatformMod.OperatingSystem.Macintosh
import typings.atStorybookUi.distKeyboardPlatformMod.OperatingSystem.Windows
import typings.atStorybookUi.distKeyboardPlatformMod.Platform
import typings.atStorybookUi.distKeyboardPlatformMod.Platform.Mac
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/ui/dist/keyboard/platform", JSImport.Namespace)
@js.native
object distKeyboardPlatformMod extends js.Object {
  @js.native
  sealed trait OperatingSystem extends js.Object
  
  @js.native
  sealed trait Platform extends js.Object
  
  val OS: OperatingSystem = js.native
  val isLinux: `false` = js.native
  val isMacintosh: `false` = js.native
  val isWindows: `false` = js.native
  @js.native
  object OperatingSystem extends js.Object {
    @js.native
    sealed trait Linux extends OperatingSystem
    
    @js.native
    sealed trait Macintosh extends OperatingSystem
    
    @js.native
    sealed trait Windows extends OperatingSystem
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OperatingSystem with Double] = js.native
    /* 3 */ @js.native
    object Linux extends TopLevel[Linux with Double]
    
    /* 2 */ @js.native
    object Macintosh extends TopLevel[Macintosh with Double]
    
    /* 1 */ @js.native
    object Windows extends TopLevel[Windows with Double]
    
  }
  
  @js.native
  object Platform extends js.Object {
    @js.native
    sealed trait Linux extends Platform
    
    @js.native
    sealed trait Mac extends Platform
    
    @js.native
    sealed trait Windows extends Platform
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Platform with Double] = js.native
    /* 1 */ @js.native
    object Linux
      extends TopLevel[typings.atStorybookUi.distKeyboardPlatformMod.Platform.Linux with Double]
    
    /* 0 */ @js.native
    object Mac extends TopLevel[Mac with Double]
    
    /* 2 */ @js.native
    object Windows
      extends TopLevel[typings.atStorybookUi.distKeyboardPlatformMod.Platform.Windows with Double]
    
  }
  
}

