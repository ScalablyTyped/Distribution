package typings
package reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.FirebaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var apiKey: java.lang.String
  var appId: java.lang.String
  var databaseURL: java.lang.String
  var messagingSenderId: java.lang.String
  var projectId: java.lang.String
  var storageBucket: java.lang.String
}

object Options {
  @scala.inline
  def apply(
    apiKey: java.lang.String,
    appId: java.lang.String,
    databaseURL: java.lang.String,
    messagingSenderId: java.lang.String,
    projectId: java.lang.String,
    storageBucket: java.lang.String
  ): Options = {
    val __obj = js.Dynamic.literal(apiKey = apiKey, appId = appId, databaseURL = databaseURL, messagingSenderId = messagingSenderId, projectId = projectId, storageBucket = storageBucket)
  
    __obj.asInstanceOf[Options]
  }
}

