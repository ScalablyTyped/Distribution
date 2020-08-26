package typings.reactNativeFirebase.mod.Firebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var apiKey: String = js.native
  var appId: String = js.native
  var databaseURL: String = js.native
  var messagingSenderId: String = js.native
  var projectId: String = js.native
  var storageBucket: String = js.native
}

object Options {
  @scala.inline
  def apply(
    apiKey: String,
    appId: String,
    databaseURL: String,
    messagingSenderId: String,
    projectId: String,
    storageBucket: String
  ): Options = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], databaseURL = databaseURL.asInstanceOf[js.Any], messagingSenderId = messagingSenderId.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], storageBucket = storageBucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatabaseURL(value: String): Self = this.set("databaseURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessagingSenderId(value: String): Self = this.set("messagingSenderId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStorageBucket(value: String): Self = this.set("storageBucket", value.asInstanceOf[js.Any])
  }
  
}

