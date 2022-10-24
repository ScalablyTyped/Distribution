package typings.storybookComponents.mod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Zoom {
  
  @JSImport("@storybook/components", "Zoom")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/components", "Zoom.Element")
  @js.native
  def Element: js.Function1[/* param0 */ ZoomProps, typings.react.mod.global.JSX.Element] = js.native
  inline def Element_=(x: js.Function1[/* param0 */ ZoomProps, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Element")(x.asInstanceOf[js.Any])
  
  @JSImport("@storybook/components", "Zoom.IFrame")
  @js.native
  def IFrame: Instantiable0[ZoomIFrame] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@storybook/components", "Zoom.IFrame")
  @js.native
  open class IFrameCls () extends ZoomIFrame
  
  inline def IFrame_=(x: Instantiable0[ZoomIFrame]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IFrame")(x.asInstanceOf[js.Any])
}
