package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VTTCue
  extends StObject
     with TextTrackCue {
  
  var align: AlignSetting = js.native
  
  def getCueAsHTML(): DocumentFragment = js.native
  
  var line: LineAndPositionSetting = js.native
  
  var lineAlign: LineAlignSetting = js.native
  
  var position: LineAndPositionSetting = js.native
  
  var positionAlign: PositionAlignSetting = js.native
  
  var region: VTTRegion | Null = js.native
  
  var size: Double = js.native
  
  var snapToLines: scala.Boolean = js.native
  
  var text: java.lang.String = js.native
  
  var vertical: DirectionSetting = js.native
}
