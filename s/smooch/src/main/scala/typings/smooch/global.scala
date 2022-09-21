package typings.smooch

import typings.smooch.anon.ConversationDataavatarUrl
import typings.smooch.anon.PartialConversation
import typings.smooch.anon.PartialNullableConversati
import typings.smooch.anon.PartialUser
import typings.smooch.smoochStrings.connected
import typings.smooch.smoochStrings.conversationColonadded
import typings.smooch.smoochStrings.conversationColonread
import typings.smooch.smoochStrings.conversationColonremoved
import typings.smooch.smoochStrings.destroy
import typings.smooch.smoochStrings.disconnected
import typings.smooch.smoochStrings.logColondebug
import typings.smooch.smoochStrings.message
import typings.smooch.smoochStrings.messageColonreceived
import typings.smooch.smoochStrings.messageColonsent
import typings.smooch.smoochStrings.participantColonadded
import typings.smooch.smoochStrings.participantColonremoved
import typings.smooch.smoochStrings.ready
import typings.smooch.smoochStrings.reconnecting
import typings.smooch.smoochStrings.typingColonstart
import typings.smooch.smoochStrings.typingColonstop
import typings.smooch.smoochStrings.unreadCount
import typings.smooch.smoochStrings.widgetColonclosed
import typings.smooch.smoochStrings.widgetColonopened
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Smooch {
    
    @JSGlobal("Smooch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Closes the conversation widget (noop when embedded)
      */
    inline def close(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[Unit]
    
    /**
      * Creates a conversation on behalf of current user. If the user does not exist, it first creates the user and then a conversation associated with it.
      *
      * All the options are optional.
      *
      * To create more than one conversation using this method, or to allow your user to create more conversations via the conversation list's New Conversation button, you must:
      * - have the Multi-Conversations feature enabled on your account
      * - update your Web Messenger integration and set canUserCreateMoreConversations to true
      *
      * Note that this API does not allow creating sdkGroup conversations. This type of conversation must be created by using the public API.
      *
      *     Smooch.createConversation({
      *       displayName: "Friday's Order",
      *       iconUrl: 'https://www.zen-tacos.com/tacos.png',
      *       description: 'Order #13377430',
      *       metadata: {
      *         isFirstTimeCustomer: true,
      *       },
      *       messages: [
      *         {
      *           text: 'Hi there! I have a question about my order.',
      *           type: 'text',
      *         },
      *       ],
      *       }).then((conversation) => {
      *         // Your code after receiving the current user's new conversation
      *       });
      */
    inline def createConversation(options: PartialConversation): js.Promise[Conversation] = ^.asInstanceOf[js.Dynamic].applyDynamic("createConversation")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Conversation]]
    
    /**
      * Destroys the Web Messenger and makes it disappear. The Web Messenger has to be reinitialized with init to be working again because it also clears up the integration id from the Web Messenger.
      * It will also unbind all listeners you might have with Smooch.on.
      */
    inline def destroy(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[js.Promise[Unit]]
    
    /**
      * Returns a Promise<object> whose payload is a conversation if it exists. If conversationId is not given, the current loaded conversation will be returned.
      *
      *     Smooch.getConversationById('62565b5c2b4039adff80b7fd').then((conversation) => {
      *       console.log(conversation);
      *     });
      *
      * or
      *
      *     Smooch.getConversationById().then((currentConversation) => {
      *       console.log(currentConversation);
      *     });
      */
    inline def getConversationById(): js.Promise[Conversation] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConversationById")().asInstanceOf[js.Promise[Conversation]]
    inline def getConversationById(conversationId: String): js.Promise[Conversation] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConversationById")(conversationId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Conversation]]
    
    /**
      * Returns a list of conversations for the current user that were fetched during app initialization as well as the paginated results.
      *
      * Note: The messages property in each conversation may only have the most recent message in the conversation. The full message list will be available either when the conversation was loaded to
      * the view or Smooch.getConversationById gets called.
      * In the event that the client reconnects due to a network issue, the list may only contain the 10 most recent conversations for the user. All the additional conversations that were fetched as
      * a result of pagination will be discarded.
      */
    inline def getConversations(): js.Array[Conversation] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConversations")().asInstanceOf[js.Array[Conversation]]
    
    /**
      * Returns the conversation being viewed by the user if it exists or null if the current user is in the conversations list view.
      */
    inline def getDisplayedConversation(): Conversation | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayedConversation")().asInstanceOf[Conversation | Null]
    
    /**
      * Fetches and returns the next 10 most active conversations of the current user. This call also appends the conversations to the conversation list view.
      */
    inline def getMoreConversations(): js.Promise[js.Array[Conversation]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMoreConversations")().asInstanceOf[js.Promise[js.Array[Conversation]]]
    
    /**
      * Returns the current user.
      */
    inline def getUser(): User = ^.asInstanceOf[js.Dynamic].applyDynamic("getUser")().asInstanceOf[User]
    
    /**
      * Returns a boolean indicating whether the user has more conversations that can be fetched for the conversation list view.
      */
    inline def hasMoreConversations(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasMoreConversations")().asInstanceOf[Boolean]
    
    /**
      * Initializes the Smooch widget in the web page using the specified options. It returns a promise that will resolve when the Web Messenger is ready. Note that except on and off, all methods needs
      * to be called after a successful init.
      */
    inline def init(options: InitOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Tells if the widget is currently opened or closed.
      */
    inline def isOpened(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOpened")().asInstanceOf[Boolean]
    
    /**
      * Loads a conversation into the current session
      */
    inline def loadConversation(conversationId: String): js.Promise[Status] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConversation")(conversationId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Status]]
    
    /**
      * Logs a user in the Web Messenger, retrieving the conversations the user already had on other browser sessions and/or devices. Note that you don't need to call this after init if you already
      * passed the external id and jwt as arguments in the call to init, in which case it's done internally as part of the initialization sequence. This returns a Promise that resolves when the Web
      * Messenger is ready again.
      */
    inline def login(externalId: String, jwt: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("login")(externalId.asInstanceOf[js.Any], jwt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Logs out the current user and reinitialize the widget with an anonymous user. This returns a promise that resolves when the Web Messenger is ready again.
      */
    inline def logout(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")().asInstanceOf[js.Promise[Unit]]
    
    /**
      * Marks all unread messages as read.
      *
      * If conversationId is not provided, the currently loaded conversation will have its messages marked as read.
      *
      *     Smooch.markAllAsRead();
      *
      * or
      *
      *     Smooch.markAllAsRead('<conversation-id>');
      */
    inline def markAllAsRead(): js.Promise[Status] = ^.asInstanceOf[js.Dynamic].applyDynamic("markAllAsRead")().asInstanceOf[js.Promise[Status]]
    inline def markAllAsRead(conversationId: String): js.Promise[Status] = ^.asInstanceOf[js.Dynamic].applyDynamic("markAllAsRead")(conversationId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Status]]
    
    /**
      * This event triggers when an active connection has been established for the first time,
      * or when the connection has been re-established after a `disconnected` or `reconnecting` event.
      */
    inline def on_connected(event: connected, callback: js.Function1[/* data */ ConversationData, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * This event triggers when a conversation is added
      */
    inline def on_conversationadded(
      event: conversationColonadded,
      callback: js.Function2[
          /* participants */ js.Array[ConversationParticipant], 
          /* data */ ConversationData, 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * This event triggers when a participant in a sdkGroup chat reads a message
      */
    inline def on_conversationread(
      event: conversationColonread,
      callback: js.Function2[/* payload */ ConversationReadEventPayload, /* data */ ConversationData, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * This event triggers when a conversation is removed
      */
    inline def on_conversationremoved(event: conversationColonremoved, callback: js.Function1[/* data */ ConversationData, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * This event triggers when the widget is destroyed.
      */
    inline def on_destroy(event: destroy, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * This event triggers when an active connection is lost
      * While disconnected, the client will not be able to receive messages or load a conversation
      */
    inline def on_disconnected(event: disconnected, callback: js.Function1[/* data */ ConversationData, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * This event triggers when the codes emits debug information
      */
    inline def on_logdebug(event: logColondebug, callback: js.Function1[/* e */ DebugLog, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * This event triggers when a message was added to the conversation
      */
    inline def on_message(event: message, callback: js.Function2[/* message */ Message, /* data */ ConversationData, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * This event triggers when the user receives a message
      */
    inline def on_messagereceived(
      event: messageColonreceived,
      callback: js.Function2[/* message */ Message, /* data */ ConversationData, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * This event triggers when the user sends a message
      */
    inline def on_messagesent(
      event: messageColonsent,
      callback: js.Function2[/* message */ Message, /* data */ ConversationData, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * This event triggers when a participant is added to a conversation
      */
    inline def on_participantadded(
      event: participantColonadded,
      callback: js.Function2[/* participant */ ConversationParticipant, /* data */ ConversationData, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * This event triggers when a participant is removed from a conversation
      */
    inline def on_participantremoved(
      event: participantColonremoved,
      callback: js.Function2[/* participant */ ConversationParticipant, /* data */ ConversationData, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    // tslint:disable:unified-signatures
    /**
      * This event triggers when init completes successfully... Be sure to bind before calling init!
      */
    inline def on_ready(event: ready, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * This event triggers when an active connection is lost and there is an attempt to reconnect
      * While reconnecting, the client will not be able to receive messages or load a conversation
      */
    inline def on_reconnecting(event: reconnecting, callback: js.Function1[/* data */ ConversationData, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * This event triggers when the business starts typing. The associated conversation is passed in the argument.
      */
    inline def on_typingstart(event: typingColonstart, callback: js.Function1[/* data */ ConversationDataavatarUrl, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * This event triggers when the business stops typing. The associated conversation is passed in the argument.
      */
    inline def on_typingstop(event: typingColonstop, callback: js.Function1[/* data */ ConversationData, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * This event triggers when the number of unread messages changes
      */
    inline def on_unreadCount(
      event: unreadCount,
      callback: js.Function2[/* unreadCount */ Double, /* data */ ConversationData, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * This event triggers when the widget is closed
      */
    inline def on_widgetclosed(event: widgetColonclosed, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * This event triggers when the widget is opened
      */
    inline def on_widgetopened(event: widgetColonopened, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Opens the conversation widget (noop when embedded)
      */
    inline def open(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("open")().asInstanceOf[Unit]
    
    inline def sendMessage(message: String, conversationId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(message.asInstanceOf[js.Any], conversationId.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * Sends a message to the targeted conversation on the user's behalf.
      */
    inline def sendMessage(message: SimpleMessage, conversationId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(message.asInstanceOf[js.Any], conversationId.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Sets a delegate on the conversation. Smooch must be initialized before calling this method.
      */
    inline def setDelegate(delegate: Delegate): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDelegate")(delegate.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Prefills the user's chat input with a predefined message.
      */
    inline def setPredefinedMessage(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPredefinedMessage")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Displays a prompt to the user suggesting the linking of the current chat instance with other 3rd-party apps.
      */
    inline def showNotificationChannelPrompt(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showNotificationChannelPrompt")().asInstanceOf[Unit]
    
    /**
      * Sends an event indicating that the user has started typing.
      * Typing updates are automatically throttled, so you may call this method as often as necessary. The typing stop event will automatically fire 10 seconds after the most recent call to this
      * method.
      * If conversationId is not provided, the currently loaded conversation will be used.
      */
    inline def startTyping(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startTyping")().asInstanceOf[Unit]
    inline def startTyping(conversationId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startTyping")(conversationId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Sends an event indicating that the user has stopped typing.
      * If conversationId is not provided, the currently loaded conversation will be used.
      */
    inline def stopTyping(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopTyping")().asInstanceOf[Unit]
    inline def stopTyping(conversationId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopTyping")(conversationId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Trigger a postback action to the targeted conversation on the user's behalf.
      * The actionId is the id property of the targeted action.
      * If you have the id of the targetted postback action, you can pass it directly to triggerPostback.
      * Otherwise, you can get the id of an action by using Smooch.getConversationById()
      */
    inline def triggerPostback(actionId: String, conversationId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerPostback")(actionId.asInstanceOf[js.Any], conversationId.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Updates the targeted conversation.
      *
      * The fields of Conversation are optional and could be set to null in the case integrators want to unset the value of the fields.
      *
      *     Smooch.updateConversation('<conversation-id>', {
      *       displayName: 'display name',
      *       iconUrl: 'https://www.example.png',
      *       description: 'description',
      *       metadata: {
      *         any: 'info',
      *       },
      *       }).then((updatedConversation) => {
      *         // Your code after receiving the current user's updated conversation
      *       });
      */
    inline def updateConversation(conversationId: String, options: PartialNullableConversati): js.Promise[Conversation] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateConversation")(conversationId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conversation]]
    
    /**
      * Updates the current user's information. If no user has been created yet, the Web Messenger will store the information and apply it to the user model when it is created.
      */
    inline def updateUser(user: PartialUser): js.Promise[Status] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateUser")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Status]]
  }
}
