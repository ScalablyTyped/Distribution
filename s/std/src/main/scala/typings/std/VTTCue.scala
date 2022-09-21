package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VTTCue
  extends StObject
     with TextTrackCue {
  
  /* standard dom */
  var align: AlignSetting = js.native
  
  /* standard dom */
  def getCueAsHTML(): DocumentFragment = js.native
  
  /* standard dom */
  var line: LineAndPositionSetting = js.native
  
  /* standard dom */
  var lineAlign: LineAlignSetting = js.native
  
  /* standard dom */
  var position: LineAndPositionSetting = js.native
  
  /* standard dom */
  var positionAlign: PositionAlignSetting = js.native
  
  /* standard dom */
  var region: VTTRegion | Null = js.native
  
  /* standard dom */
  var size: Double = js.native
  
  /* standard dom */
  var snapToLines: scala.Boolean = js.native
  
  /* standard dom */
  var text: java.lang.String = js.native
  
  /* standard dom */
  var vertical: DirectionSetting = js.native
}
