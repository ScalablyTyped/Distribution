package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.Firebase

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
    val __obj = js.Dynamic.literal(apiKey = apiKey, appId = appId, databaseURL = databaseURL, messagingSenderId = messagingSenderId, projectId = projectId, storageBucket = storageBucket)
  
    __obj.asInstanceOf[Options]
  }
}

