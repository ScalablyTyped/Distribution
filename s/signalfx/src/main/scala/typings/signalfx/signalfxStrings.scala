package typings.signalfx

import typings.signalfx.mod.EventCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signalfxStrings {
  
  @js.native
  sealed trait ALERT
    extends StObject
       with EventCategory
  inline def ALERT: ALERT = "ALERT".asInstanceOf[ALERT]
  
  @js.native
  sealed trait AUDIT
    extends StObject
       with EventCategory
  inline def AUDIT: AUDIT = "AUDIT".asInstanceOf[AUDIT]
  
  @js.native
  sealed trait COLLECTD
    extends StObject
       with EventCategory
  inline def COLLECTD: COLLECTD = "COLLECTD".asInstanceOf[COLLECTD]
  
  @js.native
  sealed trait EXCEPTION
    extends StObject
       with EventCategory
  inline def EXCEPTION: EXCEPTION = "EXCEPTION".asInstanceOf[EXCEPTION]
  
  @js.native
  sealed trait JOB
    extends StObject
       with EventCategory
  inline def JOB: JOB = "JOB".asInstanceOf[JOB]
  
  @js.native
  sealed trait SERVICE_DISCOVERY
    extends StObject
       with EventCategory
  inline def SERVICE_DISCOVERY: SERVICE_DISCOVERY = "SERVICE_DISCOVERY".asInstanceOf[SERVICE_DISCOVERY]
  
  @js.native
  sealed trait USER_DEFINED
    extends StObject
       with EventCategory
  inline def USER_DEFINED: USER_DEFINED = "USER_DEFINED".asInstanceOf[USER_DEFINED]
  
  @js.native
  sealed trait anomalous extends StObject
  inline def anomalous: anomalous = "anomalous".asInstanceOf[anomalous]
  
  @js.native
  sealed trait `control-message` extends StObject
  inline def `control-message`: `control-message` = "control-message".asInstanceOf[`control-message`]
  
  @js.native
  sealed trait data extends StObject
  inline def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait event extends StObject
  inline def event: event = "event".asInstanceOf[event]
  
  @js.native
  sealed trait metadata extends StObject
  inline def metadata: metadata = "metadata".asInstanceOf[metadata]
  
  @js.native
  sealed trait ok extends StObject
  inline def ok: ok = "ok".asInstanceOf[ok]
}
