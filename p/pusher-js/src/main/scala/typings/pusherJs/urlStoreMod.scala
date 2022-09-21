package typings.pusherJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlStoreMod {
  
  object default {
    
    @JSImport("pusher-js/types/src/core/utils/url_store", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def buildLogSuffix(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildLogSuffix")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
