package typings.rcProgress

import typings.rcProgress.interfaceMod.GapPositionType
import typings.rcProgress.interfaceMod.StrokeColorType
import typings.rcProgress.interfaceMod.StrokeLinecapType
import typings.react.mod.CSSProperties
import typings.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  /* Inlined std.Partial<rc-progress.rc-progress/es/interface.ProgressProps> */
  object defaultProps {
    
    @JSImport("rc-progress/es/common", "defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-progress/es/common", "defaultProps.className")
    @js.native
    def className: js.UndefOr[String] = js.native
    @scala.inline
    def className_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-progress/es/common", "defaultProps.gapDegree")
    @js.native
    def gapDegree: js.UndefOr[Double] = js.native
    @scala.inline
    def gapDegree_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gapDegree")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-progress/es/common", "defaultProps.gapPosition")
    @js.native
    def gapPosition: js.UndefOr[GapPositionType] = js.native
    @scala.inline
    def gapPosition_=(x: js.UndefOr[GapPositionType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gapPosition")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-progress/es/common", "defaultProps.percent")
    @js.native
    def percent: js.UndefOr[Double | js.Array[Double]] = js.native
    @scala.inline
    def percent_=(x: js.UndefOr[Double | js.Array[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("percent")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-progress/es/common", "defaultProps.prefixCls")
    @js.native
    def prefixCls: js.UndefOr[String] = js.native
    @scala.inline
    def prefixCls_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-progress/es/common", "defaultProps.strokeColor")
    @js.native
    def strokeColor: js.UndefOr[StrokeColorType] = js.native
    @scala.inline
    def strokeColor_=(x: js.UndefOr[StrokeColorType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-progress/es/common", "defaultProps.strokeLinecap")
    @js.native
    def strokeLinecap: js.UndefOr[StrokeLinecapType] = js.native
    @scala.inline
    def strokeLinecap_=(x: js.UndefOr[StrokeLinecapType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strokeLinecap")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-progress/es/common", "defaultProps.strokeWidth")
    @js.native
    def strokeWidth: js.UndefOr[Double] = js.native
    @scala.inline
    def strokeWidth_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-progress/es/common", "defaultProps.style")
    @js.native
    def style: js.UndefOr[CSSProperties] = js.native
    @scala.inline
    def style_=(x: js.UndefOr[CSSProperties]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-progress/es/common", "defaultProps.trailColor")
    @js.native
    def trailColor: js.UndefOr[String] = js.native
    @scala.inline
    def trailColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trailColor")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-progress/es/common", "defaultProps.trailWidth")
    @js.native
    def trailWidth: js.UndefOr[Double] = js.native
    @scala.inline
    def trailWidth_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trailWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-progress/es/common", "defaultProps.transition")
    @js.native
    def transition: js.UndefOr[String] = js.native
    @scala.inline
    def transition_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transition")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rc-progress/es/common", "useTransitionDuration")
  @js.native
  def useTransitionDuration(percentList: js.Array[Double]): js.Array[js.Array[MutableRefObject[js.UndefOr[scala.Nothing]]]] = js.native
}
