package typings.storybookTheming

import typings.emotionSerialize.mod.Keyframes
import typings.emotionUtils.mod.SerializedStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationMod {
  
  object animation {
    
    @JSImport("@storybook/theming/dist/animation", "animation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/theming/dist/animation", "animation.float")
    @js.native
    def float: Keyframes = js.native
    inline def float_=(x: Keyframes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("float")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming/dist/animation", "animation.glow")
    @js.native
    def glow: Keyframes = js.native
    inline def glow_=(x: Keyframes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("glow")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming/dist/animation", "animation.hoverable")
    @js.native
    def hoverable: SerializedStyles = js.native
    inline def hoverable_=(x: SerializedStyles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hoverable")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming/dist/animation", "animation.inlineGlow")
    @js.native
    def inlineGlow: SerializedStyles = js.native
    inline def inlineGlow_=(x: SerializedStyles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inlineGlow")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming/dist/animation", "animation.jiggle")
    @js.native
    def jiggle: Keyframes = js.native
    inline def jiggle_=(x: Keyframes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jiggle")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming/dist/animation", "animation.rotate360")
    @js.native
    def rotate360: Keyframes = js.native
    inline def rotate360_=(x: Keyframes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rotate360")(x.asInstanceOf[js.Any])
  }
  
  object easing {
    
    @JSImport("@storybook/theming/dist/animation", "easing")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/theming/dist/animation", "easing.rubber")
    @js.native
    def rubber: String = js.native
    inline def rubber_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rubber")(x.asInstanceOf[js.Any])
  }
}
