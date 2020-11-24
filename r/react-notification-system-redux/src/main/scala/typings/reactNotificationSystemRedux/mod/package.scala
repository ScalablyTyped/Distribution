package typings.reactNotificationSystemRedux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type NotificationShow = js.Function1[
    /* opts */ js.UndefOr[typings.reactNotificationSystem.mod.Notification], 
    typings.redux.mod.Action[js.Any]
  ]
  
  type Notifications = typings.react.mod.Component[typings.reactNotificationSystemRedux.mod.NotificationsProps, js.Object, js.Any]
  
  type NotificationsReducer[A /* <: typings.redux.mod.Action[_] */] = js.Function2[
    /* state */ typings.reactNotificationSystemRedux.mod.NotificationsState, 
    /* action */ A, 
    typings.reactNotificationSystemRedux.mod.NotificationsState
  ]
  
  type NotificationsState = js.Array[typings.reactNotificationSystem.mod.Notification]
}
