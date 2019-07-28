package typings.atReactDashNativeDashFirebaseApp.atReactDashNativeDashFirebaseAppDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  var utils: js.UndefOr[
    js.Function1[
      /* app */ js.UndefOr[this.type], 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FirebaseUtilsModule */ _
    ]
  ] = js.undefined
}

object FirebaseApp {
  @scala.inline
  def apply(
    utils: /* app */ js.UndefOr[FirebaseApp] => /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FirebaseUtilsModule */ _ = null
  ): FirebaseApp = {
    val __obj = js.Dynamic.literal()
    if (utils != null) __obj.updateDynamic("utils")(js.Any.fromFunction1(utils))
    __obj.asInstanceOf[FirebaseApp]
  }
}

