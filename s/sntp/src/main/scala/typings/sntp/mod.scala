package typings.sntp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sntp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  
  @scala.inline
  def offset(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")().asInstanceOf[js.Promise[Double]]
  
  @scala.inline
  def start(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def start(options: Options): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def stop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[Unit]
  
  @scala.inline
  def time(): js.Promise[TimeOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("time")().asInstanceOf[js.Promise[TimeOptions]]
  @scala.inline
  def time(options: Options): js.Promise[TimeOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("time")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TimeOptions]]
  
  trait Options extends StObject {
    
    var host: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var resolveReference: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setResolveReference(value: Boolean): Self = StObject.set(x, "resolveReference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveReferenceUndefined: Self = StObject.set(x, "resolveReference", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait TimeOptions extends StObject {
    
    var d: Double
    
    var isValid: Boolean
    
    var leapIndicator: String
    
    var mode: String
    
    var originateTimestamp: Double
    
    var pollInterval: Double
    
    var precision: Double
    
    var receiveTimestamp: Double
    
    var receivedLocally: Double
    
    var referenceId: String
    
    var referenceTimestamp: Double
    
    var rootDelay: Double
    
    var rootDispersion: Double
    
    var stratum: String
    
    var t: Double
    
    var transmitTimestamp: Double
    
    var version: Double
  }
  object TimeOptions {
    
    @scala.inline
    def apply(
      d: Double,
      isValid: Boolean,
      leapIndicator: String,
      mode: String,
      originateTimestamp: Double,
      pollInterval: Double,
      precision: Double,
      receiveTimestamp: Double,
      receivedLocally: Double,
      referenceId: String,
      referenceTimestamp: Double,
      rootDelay: Double,
      rootDispersion: Double,
      stratum: String,
      t: Double,
      transmitTimestamp: Double,
      version: Double
    ): TimeOptions = {
      val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], leapIndicator = leapIndicator.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], originateTimestamp = originateTimestamp.asInstanceOf[js.Any], pollInterval = pollInterval.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], receiveTimestamp = receiveTimestamp.asInstanceOf[js.Any], receivedLocally = receivedLocally.asInstanceOf[js.Any], referenceId = referenceId.asInstanceOf[js.Any], referenceTimestamp = referenceTimestamp.asInstanceOf[js.Any], rootDelay = rootDelay.asInstanceOf[js.Any], rootDispersion = rootDispersion.asInstanceOf[js.Any], stratum = stratum.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], transmitTimestamp = transmitTimestamp.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeOptions]
    }
    
    @scala.inline
    implicit class TimeOptionsMutableBuilder[Self <: TimeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeapIndicator(value: String): Self = StObject.set(x, "leapIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginateTimestamp(value: Double): Self = StObject.set(x, "originateTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPollInterval(value: Double): Self = StObject.set(x, "pollInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiveTimestamp(value: Double): Self = StObject.set(x, "receiveTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceivedLocally(value: Double): Self = StObject.set(x, "receivedLocally", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceId(value: String): Self = StObject.set(x, "referenceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceTimestamp(value: Double): Self = StObject.set(x, "referenceTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootDelay(value: Double): Self = StObject.set(x, "rootDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootDispersion(value: Double): Self = StObject.set(x, "rootDispersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStratum(value: String): Self = StObject.set(x, "stratum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransmitTimestamp(value: Double): Self = StObject.set(x, "transmitTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
