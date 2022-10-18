package typings.reactMdUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLayoutScrollbarSizeMod {
  
  @JSImport("@react-md/utils/types/layout/scrollbarSize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  inline def scrollbarSize(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollbarSize")().asInstanceOf[Double]
  inline def scrollbarSize(`type`: Unit, forced: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollbarSize")(`type`.asInstanceOf[js.Any], forced.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def scrollbarSize(`type`: SizingType): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollbarSize")(`type`.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def scrollbarSize(`type`: SizingType, forced: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollbarSize")(`type`.asInstanceOf[js.Any], forced.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdUtils.reactMdUtilsStrings.height
    - typings.reactMdUtils.reactMdUtilsStrings.width
  */
  trait SizingType extends StObject
  object SizingType {
    
    inline def height: typings.reactMdUtils.reactMdUtilsStrings.height = "height".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.height]
    
    inline def width: typings.reactMdUtils.reactMdUtilsStrings.width = "width".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.width]
  }
}
