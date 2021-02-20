package typings.protractor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskLoggerMod {
  
  @JSImport("protractor/built/taskLogger", "TaskLogger")
  @js.native
  class TaskLogger protected () extends StObject {
    /**
      * Log output such that metadata are appended.
      * Calling log(data) will not flush to console until you call flush()
      *
      * @constructor
      * @param {object} task Task that is being reported.
      * @param {number} pid PID of process running the task.
      */
    def this(task: js.Any, pid: Double) = this()
    
    var buffer: js.Any = js.native
    
    /**
      * Flushes the buffer to stdout.
      */
    def flush(): Unit = js.native
    
    var insertTag: js.Any = js.native
    
    /**
      * Log the data in the argument such that metadata are appended.
      * The data will be saved to a buffer until flush() is called.
      *
      * @param {string} data
      */
    def log(data: String): Unit = js.native
    
    /**
      * Log the header for the current task including information such as
      * PID, browser name/version, task Id, specs being run.
      *
      * @private
      */
    /* private */ def logHeader_(): js.Any = js.native
    
    /**
      * Prints the contents of the buffer without clearing it.
      */
    def peek(): Unit = js.native
    
    var pid: js.Any = js.native
    
    var task: js.Any = js.native
  }
}
