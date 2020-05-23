package typings.reactNativeFirebase.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Category
import typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Channel
import typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.ChannelGroup
import typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Importance
import typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.RemoteInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  var Action: Instantiable3[
    /* action */ String, 
    /* icon */ String, 
    /* title */ String, 
    typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Action
  ]
  var BadgeIconType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.BadgeIconType */ js.Any
  var Category: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Category
  var Channel: Instantiable3[
    /* channelId */ String, 
    /* name */ String, 
    /* importance */ Importance, 
    typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Channel
  ]
  var ChannelGroup: Instantiable2[
    /* groupId */ String, 
    /* name */ String, 
    typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.ChannelGroup
  ]
  var Defaults: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Defaults */ js.Any
  var GroupAlert: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.GroupAlert */ js.Any
  var Importance: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Importance */ js.Any
  var Priority: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Priority */ js.Any
  var RemoteInput: Instantiable1[
    /* resultKey */ String, 
    typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.RemoteInput
  ]
  var SemanticAction: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.SemanticAction */ js.Any
  var Visibility: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Visibility */ js.Any
}

object Action {
  @scala.inline
  def apply(
    Action: Instantiable3[
      /* action */ String, 
      /* icon */ String, 
      /* title */ String, 
      typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Action
    ],
    BadgeIconType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.BadgeIconType */ js.Any,
    Category: Category,
    Channel: Instantiable3[/* channelId */ String, /* name */ String, /* importance */ Importance, Channel],
    ChannelGroup: Instantiable2[/* groupId */ String, /* name */ String, ChannelGroup],
    Defaults: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Defaults */ js.Any,
    GroupAlert: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.GroupAlert */ js.Any,
    Importance: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Importance */ js.Any,
    Priority: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Priority */ js.Any,
    RemoteInput: Instantiable1[/* resultKey */ String, RemoteInput],
    SemanticAction: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.SemanticAction */ js.Any,
    Visibility: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Visibility */ js.Any
  ): Action = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], BadgeIconType = BadgeIconType.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], Channel = Channel.asInstanceOf[js.Any], ChannelGroup = ChannelGroup.asInstanceOf[js.Any], Defaults = Defaults.asInstanceOf[js.Any], GroupAlert = GroupAlert.asInstanceOf[js.Any], Importance = Importance.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], RemoteInput = RemoteInput.asInstanceOf[js.Any], SemanticAction = SemanticAction.asInstanceOf[js.Any], Visibility = Visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

