package typings.speedtestNet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  /**
    * Set to `true` to accept the Ookla GDPR terms. This must be done
    * (at least) once on the system. If you have not accepted the Ookla
    * GDPR terms you can read their disclaimer by running the speedtest-net
    * CLI without the --accept-license option.
    */
  var acceptGdpr: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to `true` to accept the Ookla EULA, TOS and Privacy policy. This
    * must be done (at least) once on the system. If you have not accepted
    * the Ookla license terms, you can view the links to their agreements
    * by running the speedtest-net CLI without the --accept-license option.
    */
  var acceptLicense: js.UndefOr[Boolean] = js.undefined
  
  /** Binary executable path of the Ookla speedtest CLI */
  var binary: js.UndefOr[String] = js.undefined
  
  /** Default '1.0.0' Binary executable version */
  var binaryVersion: js.UndefOr[String] = js.undefined
  
  /**
    * A cancellation function created with `speedTest.makeCancel()` to
    * cancel the test.
    */
  var cancel: js.UndefOr[CancelFunction] = js.undefined
  
  /** Server host to connect to */
  var host: js.UndefOr[String] = js.undefined
  
  /** Function to handle progress events */
  var progress: js.UndefOr[ProgressFunction] = js.undefined
  
  /** ID of the server to restrict the tests against. */
  var serverId: js.UndefOr[String] = js.undefined
  
  /** IP of the network interface to bind */
  var sourceIp: js.UndefOr[String] = js.undefined
  
  /** Log level for `{ type: log }` progress events */
  var verbosity: js.UndefOr[Double] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setAcceptGdpr(value: Boolean): Self = StObject.set(x, "acceptGdpr", value.asInstanceOf[js.Any])
    
    inline def setAcceptGdprUndefined: Self = StObject.set(x, "acceptGdpr", js.undefined)
    
    inline def setAcceptLicense(value: Boolean): Self = StObject.set(x, "acceptLicense", value.asInstanceOf[js.Any])
    
    inline def setAcceptLicenseUndefined: Self = StObject.set(x, "acceptLicense", js.undefined)
    
    inline def setBinary(value: String): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    inline def setBinaryVersion(value: String): Self = StObject.set(x, "binaryVersion", value.asInstanceOf[js.Any])
    
    inline def setBinaryVersionUndefined: Self = StObject.set(x, "binaryVersion", js.undefined)
    
    inline def setCancel(
      value: (/* setCancelHandler */ js.UndefOr[js.Symbol], /* newHandler */ js.UndefOr[js.Function0[Unit]]) => Boolean | Unit
    ): Self = StObject.set(x, "cancel", js.Any.fromFunction2(value))
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setProgress(value: /* event */ js.UndefOr[SpeedTestEvent] => Unit): Self = StObject.set(x, "progress", js.Any.fromFunction1(value))
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setServerId(value: String): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
    
    inline def setServerIdUndefined: Self = StObject.set(x, "serverId", js.undefined)
    
    inline def setSourceIp(value: String): Self = StObject.set(x, "sourceIp", value.asInstanceOf[js.Any])
    
    inline def setSourceIpUndefined: Self = StObject.set(x, "sourceIp", js.undefined)
    
    inline def setVerbosity(value: Double): Self = StObject.set(x, "verbosity", value.asInstanceOf[js.Any])
    
    inline def setVerbosityUndefined: Self = StObject.set(x, "verbosity", js.undefined)
  }
}
