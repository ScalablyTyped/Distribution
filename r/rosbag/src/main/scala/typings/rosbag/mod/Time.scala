package typings.rosbag.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a timestamp based on the UNIX epoch (1970 Jan 1).
  * See also: http://wiki.ros.org/roscpp/Overview/Time
  */
trait Time extends StObject {
  
  // additional nanoseconds past the sec value
  var nsec: Double
  
  // whole seconds
  var sec: Double
}
object Time {
  
  inline def apply(nsec: Double, sec: Double): Time = {
    val __obj = js.Dynamic.literal(nsec = nsec.asInstanceOf[js.Any], sec = sec.asInstanceOf[js.Any])
    __obj.asInstanceOf[Time]
  }
  
  extension [Self <: Time](x: Self) {
    
    inline def setNsec(value: Double): Self = StObject.set(x, "nsec", value.asInstanceOf[js.Any])
    
    inline def setSec(value: Double): Self = StObject.set(x, "sec", value.asInstanceOf[js.Any])
  }
}
