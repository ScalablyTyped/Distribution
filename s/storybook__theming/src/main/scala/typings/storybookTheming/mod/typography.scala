package typings.storybookTheming.mod

import typings.storybookTheming.anon.Base
import typings.storybookTheming.anon.Black
import typings.storybookTheming.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typography {
  
  @JSImport("@storybook/theming", "typography")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/theming", "typography.fonts")
  @js.native
  def fonts: Base = js.native
  inline def fonts_=(x: Base): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fonts")(x.asInstanceOf[js.Any])
  
  @JSImport("@storybook/theming", "typography.size")
  @js.native
  def size: Code = js.native
  inline def size_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
  
  @JSImport("@storybook/theming", "typography.weight")
  @js.native
  def weight: Black = js.native
  inline def weight_=(x: Black): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("weight")(x.asInstanceOf[js.Any])
}
