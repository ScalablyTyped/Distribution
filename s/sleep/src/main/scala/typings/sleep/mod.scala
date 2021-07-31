package typings.sleep

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sleep", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Sleep for n milliseconds.
    *
    * @param n Number of milliseconds to sleep.
    */
  @scala.inline
  def msleep(n: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("msleep")(n.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sleep for <i>n</i> seconds.
    *
    * @param n Number of seconds to sleep.
    */
  @scala.inline
  def sleep(n: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(n.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sleep for n microseconds.
    *
    * @param n Number of microseconds to sleep; 1 second is 1,000,000 microseconds.
    */
  @scala.inline
  def usleep(n: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("usleep")(n.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
