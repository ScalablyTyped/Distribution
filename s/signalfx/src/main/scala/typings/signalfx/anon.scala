package typings.signalfx

import typings.signalfx.signalfxStrings.anomalous
import typings.signalfx.signalfxStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Args extends StObject {
    
    var args: js.Object
    
    var op: String
  }
  object Args {
    
    inline def apply(args: js.Object, op: String): Args = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    extension [Self <: Args](x: Self) {
      
      inline def setArgs(value: js.Object): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  trait CONTROL extends StObject {
    
    var CONTROL: String
    
    var DATA: String
    
    var EVENT: String
    
    var METADATA: String
  }
  object CONTROL {
    
    inline def apply(CONTROL: String, DATA: String, EVENT: String, METADATA: String): CONTROL = {
      val __obj = js.Dynamic.literal(CONTROL = CONTROL.asInstanceOf[js.Any], DATA = DATA.asInstanceOf[js.Any], EVENT = EVENT.asInstanceOf[js.Any], METADATA = METADATA.asInstanceOf[js.Any])
      __obj.asInstanceOf[CONTROL]
    }
    
    extension [Self <: CONTROL](x: Self) {
      
      inline def setCONTROL(value: String): Self = StObject.set(x, "CONTROL", value.asInstanceOf[js.Any])
      
      inline def setDATA(value: String): Self = StObject.set(x, "DATA", value.asInstanceOf[js.Any])
      
      inline def setEVENT(value: String): Self = StObject.set(x, "EVENT", value.asInstanceOf[js.Any])
      
      inline def setMETADATA(value: String): Self = StObject.set(x, "METADATA", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    var error: Any
  }
  object Error {
    
    inline def apply(error: Any): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait IncidentId extends StObject {
    
    var incidentId: String
    
    var inputValues: String
    
    var is: ok | anomalous
    
    var was: ok | anomalous
  }
  object IncidentId {
    
    inline def apply(incidentId: String, inputValues: String, is: ok | anomalous, was: ok | anomalous): IncidentId = {
      val __obj = js.Dynamic.literal(incidentId = incidentId.asInstanceOf[js.Any], inputValues = inputValues.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], was = was.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncidentId]
    }
    
    extension [Self <: IncidentId](x: Self) {
      
      inline def setIncidentId(value: String): Self = StObject.set(x, "incidentId", value.asInstanceOf[js.Any])
      
      inline def setInputValues(value: String): Self = StObject.set(x, "inputValues", value.asInstanceOf[js.Any])
      
      inline def setIs(value: ok | anomalous): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setWas(value: ok | anomalous): Self = StObject.set(x, "was", value.asInstanceOf[js.Any])
    }
  }
  
  trait JobId extends StObject {
    
    var jobId: String
    
    var sf_isPreQuantized: Boolean
    
    var sf_key: js.Array[String]
    
    var sf_metric: String
    
    var sf_organizationID: String
    
    var sf_resolutionMs: Double
    
    var sf_type: String
  }
  object JobId {
    
    inline def apply(
      jobId: String,
      sf_isPreQuantized: Boolean,
      sf_key: js.Array[String],
      sf_metric: String,
      sf_organizationID: String,
      sf_resolutionMs: Double,
      sf_type: String
    ): JobId = {
      val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], sf_isPreQuantized = sf_isPreQuantized.asInstanceOf[js.Any], sf_key = sf_key.asInstanceOf[js.Any], sf_metric = sf_metric.asInstanceOf[js.Any], sf_organizationID = sf_organizationID.asInstanceOf[js.Any], sf_resolutionMs = sf_resolutionMs.asInstanceOf[js.Any], sf_type = sf_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobId]
    }
    
    extension [Self <: JobId](x: Self) {
      
      inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
      
      inline def setSf_isPreQuantized(value: Boolean): Self = StObject.set(x, "sf_isPreQuantized", value.asInstanceOf[js.Any])
      
      inline def setSf_key(value: js.Array[String]): Self = StObject.set(x, "sf_key", value.asInstanceOf[js.Any])
      
      inline def setSf_keyVarargs(value: String*): Self = StObject.set(x, "sf_key", js.Array(value*))
      
      inline def setSf_metric(value: String): Self = StObject.set(x, "sf_metric", value.asInstanceOf[js.Any])
      
      inline def setSf_organizationID(value: String): Self = StObject.set(x, "sf_organizationID", value.asInstanceOf[js.Any])
      
      inline def setSf_resolutionMs(value: Double): Self = StObject.set(x, "sf_resolutionMs", value.asInstanceOf[js.Any])
      
      inline def setSf_type(value: String): Self = StObject.set(x, "sf_type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Matcher extends StObject {
    
    var matcher: Params
  }
  object Matcher {
    
    inline def apply(matcher: Params): Matcher = {
      val __obj = js.Dynamic.literal(matcher = matcher.asInstanceOf[js.Any])
      __obj.asInstanceOf[Matcher]
    }
    
    extension [Self <: Matcher](x: Self) {
      
      inline def setMatcher(value: Params): Self = StObject.set(x, "matcher", value.asInstanceOf[js.Any])
    }
  }
  
  trait Params extends StObject {
    
    var params: Args
  }
  object Params {
    
    inline def apply(params: Args): Params = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    extension [Self <: Params](x: Self) {
      
      inline def setParams(value: Args): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rate extends StObject {
    
    var rate: Double
  }
  object Rate {
    
    inline def apply(rate: Double): Rate = {
      val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rate]
    }
    
    extension [Self <: Rate](x: Self) {
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    }
  }
  
  trait SfjobabortReason extends StObject {
    
    var sf_job_abortReason: String
    
    var sf_job_abortState: String
  }
  object SfjobabortReason {
    
    inline def apply(sf_job_abortReason: String, sf_job_abortState: String): SfjobabortReason = {
      val __obj = js.Dynamic.literal(sf_job_abortReason = sf_job_abortReason.asInstanceOf[js.Any], sf_job_abortState = sf_job_abortState.asInstanceOf[js.Any])
      __obj.asInstanceOf[SfjobabortReason]
    }
    
    extension [Self <: SfjobabortReason](x: Self) {
      
      inline def setSf_job_abortReason(value: String): Self = StObject.set(x, "sf_job_abortReason", value.asInstanceOf[js.Any])
      
      inline def setSf_job_abortState(value: String): Self = StObject.set(x, "sf_job_abortState", value.asInstanceOf[js.Any])
    }
  }
  
  trait TsId extends StObject {
    
    var tsId: String
    
    var value: Double
  }
  object TsId {
    
    inline def apply(tsId: String, value: Double): TsId = {
      val __obj = js.Dynamic.literal(tsId = tsId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TsId]
    }
    
    extension [Self <: TsId](x: Self) {
      
      inline def setTsId(value: String): Self = StObject.set(x, "tsId", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
