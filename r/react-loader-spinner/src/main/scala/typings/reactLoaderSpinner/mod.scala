package typings.reactLoaderSpinner

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-loader-spinner", JSImport.Default)
  @js.native
  val default: FC[LoaderProps] = js.native
  
  @js.native
  trait LoaderProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var radius: js.UndefOr[Double] = js.native
    
    var secondaryColor: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    // in milliseconds
    var `type`: js.UndefOr[Types] = js.native
    
    var visible: js.UndefOr[Boolean | String] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object LoaderProps {
    
    @scala.inline
    def apply(): LoaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoaderProps]
    }
    
    @scala.inline
    implicit class LoaderPropsMutableBuilder[Self <: LoaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryColorUndefined: Self = StObject.set(x, "secondaryColor", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setType(value: Types): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean | String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Audio
    - typings.reactLoaderSpinner.reactLoaderSpinnerStrings.BallTriangle
    - typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Bars
    - typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Circles
    - typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Grid
    - typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Hearts
    - typings.reactLoaderSpinner.reactLoaderSpinnerStrings.MutatingDots
    - typings.reactLoaderSpinner.reactLoaderSpinnerStrings.None
    - typings.reactLoaderSpinner.reactLoaderSpinnerStrings.NotSpecified
    - typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Oval
    - typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Plane
    - typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Puff
    - typings.reactLoaderSpinner.reactLoaderSpinnerStrings.RevolvingDot
    - typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Rings
    - typings.reactLoaderSpinner.reactLoaderSpinnerStrings.TailSpin
    - typings.reactLoaderSpinner.reactLoaderSpinnerStrings.ThreeDots
    - typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Triangle
    - typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Watch
  */
  trait Types extends StObject
  object Types {
    
    @scala.inline
    def Audio: typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Audio = "Audio".asInstanceOf[typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Audio]
    
    @scala.inline
    def BallTriangle: typings.reactLoaderSpinner.reactLoaderSpinnerStrings.BallTriangle = "BallTriangle".asInstanceOf[typings.reactLoaderSpinner.reactLoaderSpinnerStrings.BallTriangle]
    
    @scala.inline
    def Bars: typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Bars = "Bars".asInstanceOf[typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Bars]
    
    @scala.inline
    def Circles: typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Circles = "Circles".asInstanceOf[typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Circles]
    
    @scala.inline
    def Grid: typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Grid = "Grid".asInstanceOf[typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Grid]
    
    @scala.inline
    def Hearts: typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Hearts = "Hearts".asInstanceOf[typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Hearts]
    
    @scala.inline
    def MutatingDots: typings.reactLoaderSpinner.reactLoaderSpinnerStrings.MutatingDots = "MutatingDots".asInstanceOf[typings.reactLoaderSpinner.reactLoaderSpinnerStrings.MutatingDots]
    
    @scala.inline
    def None: typings.reactLoaderSpinner.reactLoaderSpinnerStrings.None = "None".asInstanceOf[typings.reactLoaderSpinner.reactLoaderSpinnerStrings.None]
    
    @scala.inline
    def NotSpecified: typings.reactLoaderSpinner.reactLoaderSpinnerStrings.NotSpecified = "NotSpecified".asInstanceOf[typings.reactLoaderSpinner.reactLoaderSpinnerStrings.NotSpecified]
    
    @scala.inline
    def Oval: typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Oval = "Oval".asInstanceOf[typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Oval]
    
    @scala.inline
    def Plane: typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Plane = "Plane".asInstanceOf[typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Plane]
    
    @scala.inline
    def Puff: typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Puff = "Puff".asInstanceOf[typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Puff]
    
    @scala.inline
    def RevolvingDot: typings.reactLoaderSpinner.reactLoaderSpinnerStrings.RevolvingDot = "RevolvingDot".asInstanceOf[typings.reactLoaderSpinner.reactLoaderSpinnerStrings.RevolvingDot]
    
    @scala.inline
    def Rings: typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Rings = "Rings".asInstanceOf[typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Rings]
    
    @scala.inline
    def TailSpin: typings.reactLoaderSpinner.reactLoaderSpinnerStrings.TailSpin = "TailSpin".asInstanceOf[typings.reactLoaderSpinner.reactLoaderSpinnerStrings.TailSpin]
    
    @scala.inline
    def ThreeDots: typings.reactLoaderSpinner.reactLoaderSpinnerStrings.ThreeDots = "ThreeDots".asInstanceOf[typings.reactLoaderSpinner.reactLoaderSpinnerStrings.ThreeDots]
    
    @scala.inline
    def Triangle: typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Triangle = "Triangle".asInstanceOf[typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Triangle]
    
    @scala.inline
    def Watch: typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Watch = "Watch".asInstanceOf[typings.reactLoaderSpinner.reactLoaderSpinnerStrings.Watch]
  }
  
  type _To = FC[LoaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FC[LoaderProps] = default
}
