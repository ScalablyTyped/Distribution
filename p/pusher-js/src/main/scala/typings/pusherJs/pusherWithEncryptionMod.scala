package typings.pusherJs

import typings.pusherJs.coreOptionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pusherWithEncryptionMod {
  
  @JSImport("pusher-js/types/src/core/pusher-with-encryption", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.pusherJs.pusherMod.default {
    def this(app_key: String) = this()
    def this(app_key: String, options: Options) = this()
  }
  
  type PusherWithEncryption = typings.pusherJs.pusherMod.default
}
