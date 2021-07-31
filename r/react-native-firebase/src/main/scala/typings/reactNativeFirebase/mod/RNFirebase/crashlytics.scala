package typings.reactNativeFirebase.mod.RNFirebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crashlytics {
  
  @js.native
  trait Crashlytics extends StObject {
    
    /**
      * Forces a crash. Useful for testing your application is set up correctly.
      */
    def crash(): Unit = js.native
    
    /**
      * Enable Crashlytics reporting. Only avaliable when disabled automatic initialization
      */
    def enableCrashlyticsCollection(): Unit = js.native
    
    /**
      * Logs a message that will appear in any subsequent crash reports.
      */
    def log(message: String): Unit = js.native
    
    /**
      * Logs a custom non fatal exception.
      */
    def recordCustomError(name: String, message: String): Unit = js.native
    def recordCustomError(name: String, message: String, stack: js.Array[customError]): Unit = js.native
    
    /**
      * Logs a non fatal exception.
      */
    def recordError(code: Double, message: String): Unit = js.native
    
    /**
      * Set a boolean value to show alongside any subsequent crash reports.
      */
    def setBoolValue(key: String, value: Boolean): Unit = js.native
    
    /**
      * Set a float value to show alongside any subsequent crash reports.
      */
    def setFloatValue(key: String, value: Double): Unit = js.native
    
    /**
      * Set an integer value to show alongside any subsequent crash reports.
      */
    def setIntValue(key: String, value: Double): Unit = js.native
    
    /**
      * Set a string value to show alongside any subsequent crash reports.
      */
    def setStringValue(key: String, value: String): Unit = js.native
    
    /**
      * Set the user email to show alongside any subsequent crash reports.
      */
    def setUserEmail(userEmail: String): Unit = js.native
    
    /**
      * Set the user ID to show alongside any subsequent crash reports.
      */
    def setUserIdentifier(userId: String): Unit = js.native
    
    /**
      * Set the user name to show alongside any subsequent crash reports.
      */
    def setUserName(userName: String): Unit = js.native
  }
  
  trait customError extends StObject {
    
    var additional: js.UndefOr[js.Object] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var fileName: String
    
    var functionName: js.UndefOr[String] = js.undefined
    
    var lineNumber: js.UndefOr[Double] = js.undefined
  }
  object customError {
    
    @scala.inline
    def apply(fileName: String): customError = {
      val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any])
      __obj.asInstanceOf[customError]
    }
    
    @scala.inline
    implicit class customErrorMutableBuilder[Self <: customError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditional(value: js.Object): Self = StObject.set(x, "additional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalUndefined: Self = StObject.set(x, "additional", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
      
      @scala.inline
      def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
    }
  }
}
