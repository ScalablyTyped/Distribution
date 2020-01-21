package typings.reactNativeFirebase.mod.Firebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var apiKey: String
  var appId: String
  var databaseURL: String
  var messagingSenderId: String
  var projectId: String
  var storageBucket: String
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
}

