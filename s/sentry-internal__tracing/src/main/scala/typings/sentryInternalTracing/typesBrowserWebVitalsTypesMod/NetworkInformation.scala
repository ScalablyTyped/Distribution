package typings.sentryInternalTracing.typesBrowserWebVitalsTypesMod

import typings.std.EventListener
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkInformation
  extends StObject
     with EventTarget {
  
  val downlink: js.UndefOr[Megabit] = js.native
  
  val downlinkMax: js.UndefOr[Megabit] = js.native
  
  val effectiveType: js.UndefOr[EffectiveConnectionType] = js.native
  
  var onchange: js.UndefOr[EventListener] = js.native
  
  val rtt: js.UndefOr[Millisecond] = js.native
  
  val saveData: js.UndefOr[Boolean] = js.native
  
  val `type`: js.UndefOr[ConnectionType] = js.native
}
