package typings.steamcommunity

import typings.node.bufferMod.global.Buffer
import typings.steamcommunity.anon.AppID_
import typings.steamcommunity.mod.Callback
import typings.steamcommunity.mod.CallbackError
import typings.steamcommunity.mod.EditProfileSettings
import typings.steamcommunity.mod.ProfileSetting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object profileMod {
  
  @js.native
  trait Profile extends StObject {
    
    /**
      * Delete a previously-posted profile status update.
      * @param postID
      * @param [callback]
      */
    def deleteProfileStatus(postID: Double, callback: Callback): Unit = js.native
    
    /**
      * Updates one or more parts of your profile.
      *
      * @param settings
      * @param callback
      */
    def editProfile(settings: EditProfileSettings, callback: Callback): Unit = js.native
    
    /**
      * Posts a status update to your profile feed.
      *
      * @param statusText A string containing your new status update's content (can contain BBCode and emoticons).
      * @param options Optional. Can be omitted if no options are desired. An object containing zero or more of properties.
      * @param callback Required. Called when request completes.
      */
    def postProfileStatus(
      statusText: Any,
      options: AppID_,
      callback: js.Function2[/* err */ CallbackError, /* postID */ Any, Any]
    ): Unit = js.native
    
    /**
      * Updates one or more parts of your profile settings.
      *
      * @param settings An profile settings object.
      * @param callback Optional. Called when the request completes.
      */
    def profileSettings(settings: ProfileSetting, callback: Callback): Unit = js.native
    
    /**
      * If your Steam account is new and your profile isn't set up yet, you can call this to create it.
      *
      * @param callback Called when the action is complete.
      */
    def setupProfile(callback: Callback): Unit = js.native
    
    def uploadAvatar(image: String, format: Any, callback: js.Function2[/* err */ CallbackError, /* url */ String, Any]): Unit = js.native
    /**
      * Replaces your current avatar image with a new one.
      *
      * @param image A `Buffer` containing the image, a string containing a URL to the image, or a string containing the path to the image on the local disk.
      * @param format Optional. The format of the image.
      * Is required if `image` is a `Buffer`, else it will be detected from the `Content-Type` header (if `image` is a URL) or the file extension (if `image` is a local path).
      * If provided, `format` should be one of `jpg` (or `jpeg`), `gif`, or `png`. These are the only supported image formats.
      * @param callback Optional. Called when the upload is complete or fails.
      */
    def uploadAvatar(image: Buffer, format: Any, callback: js.Function2[/* err */ CallbackError, /* url */ String, Any]): Unit = js.native
  }
}
