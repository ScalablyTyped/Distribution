package typings.reactNativeCommunityCliTools

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLoggerMod {
  
  object default {
    
    @JSImport("@react-native-community/cli-tools/build/logger", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def debug(messages: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(messages.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    inline def disable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[Unit]
    
    inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
    
    inline def error(messages: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(messages.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    inline def info(messages: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(messages.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    inline def isVerbose(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVerbose")().asInstanceOf[Boolean]
    
    inline def log(messages: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(messages.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    inline def setVerbose(level: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setVerbose")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def success(messages: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("success")(messages.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    inline def warn(messages: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(messages.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  }
}
