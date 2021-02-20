package typings.reactNativeFbsdk

import typings.reactNativeFbsdk.mod.AppEventsFlushBehavior
import typings.reactNativeFbsdk.mod.AppGroupPrivacy
import typings.reactNativeFbsdk.mod.AuxiliaryViewPosition
import typings.reactNativeFbsdk.mod.DefaultAudience
import typings.reactNativeFbsdk.mod.GameRequestActionType
import typings.reactNativeFbsdk.mod.GameRequestFilters
import typings.reactNativeFbsdk.mod.HorizontalAlignment
import typings.reactNativeFbsdk.mod.LoginBehaviorAndroid
import typings.reactNativeFbsdk.mod.ObjectIdActionType
import typings.reactNativeFbsdk.mod.OpenGraphValueType
import typings.reactNativeFbsdk.mod.ShareDialogMode
import typings.reactNativeFbsdk.mod.ShareDialogModeAndroid
import typings.reactNativeFbsdk.mod.ShareDialogModeIOS
import typings.reactNativeFbsdk.mod.TooltipBehaviorIOS
import typings.reactNativeFbsdk.mod._Permissions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeFbsdkStrings {
  
  @js.native
  sealed trait Closed extends AppGroupPrivacy
  @scala.inline
  def Closed: Closed = "Closed".asInstanceOf[Closed]
  
  @js.native
  sealed trait Open extends AppGroupPrivacy
  @scala.inline
  def Open: Open = "Open".asInstanceOf[Open]
  
  @js.native
  sealed trait ads_management extends _Permissions
  @scala.inline
  def ads_management: ads_management = "ads_management".asInstanceOf[ads_management]
  
  @js.native
  sealed trait ads_read extends _Permissions
  @scala.inline
  def ads_read: ads_read = "ads_read".asInstanceOf[ads_read]
  
  @js.native
  sealed trait app_non_users extends GameRequestFilters
  @scala.inline
  def app_non_users: app_non_users = "app_non_users".asInstanceOf[app_non_users]
  
  @js.native
  sealed trait app_users extends GameRequestFilters
  @scala.inline
  def app_users: app_users = "app_users".asInstanceOf[app_users]
  
  @js.native
  sealed trait askfor extends GameRequestActionType
  @scala.inline
  def askfor: askfor = "askfor".asInstanceOf[askfor]
  
  @js.native
  sealed trait auto
    extends AppEventsFlushBehavior
       with TooltipBehaviorIOS
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait automatic
    extends ShareDialogMode
       with ShareDialogModeAndroid
       with ShareDialogModeIOS
  @scala.inline
  def automatic: automatic = "automatic".asInstanceOf[automatic]
  
  @js.native
  sealed trait bottom extends AuxiliaryViewPosition
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait browser
    extends ShareDialogMode
       with ShareDialogModeIOS
  @scala.inline
  def browser: browser = "browser".asInstanceOf[browser]
  
  @js.native
  sealed trait business_management extends _Permissions
  @scala.inline
  def business_management: business_management = "business_management".asInstanceOf[business_management]
  
  @js.native
  sealed trait center extends HorizontalAlignment
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait disable extends TooltipBehaviorIOS
  @scala.inline
  def disable: disable = "disable".asInstanceOf[disable]
  
  @js.native
  sealed trait email extends _Permissions
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  
  @js.native
  sealed trait everyone extends DefaultAudience
  @scala.inline
  def everyone: everyone = "everyone".asInstanceOf[everyone]
  
  @js.native
  sealed trait `explicitly-only` extends AppEventsFlushBehavior
  @scala.inline
  def `explicitly-only`: `explicitly-only` = "explicitly-only".asInstanceOf[`explicitly-only`]
  
  @js.native
  sealed trait f extends StObject
  @scala.inline
  def f: f = "f".asInstanceOf[f]
  
  @js.native
  sealed trait feed
    extends ShareDialogMode
       with ShareDialogModeAndroid
  @scala.inline
  def feed: feed = "feed".asInstanceOf[feed]
  
  @js.native
  sealed trait force_display extends TooltipBehaviorIOS
  @scala.inline
  def force_display: force_display = "force_display".asInstanceOf[force_display]
  
  @js.native
  sealed trait friends extends DefaultAudience
  @scala.inline
  def friends: friends = "friends".asInstanceOf[friends]
  
  @js.native
  sealed trait `inline` extends AuxiliaryViewPosition
  @scala.inline
  def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  
  @js.native
  sealed trait left extends HorizontalAlignment
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait link extends StObject
  @scala.inline
  def link: link = "link".asInstanceOf[link]
  
  @js.native
  sealed trait m extends StObject
  @scala.inline
  def m: m = "m".asInstanceOf[m]
  
  @js.native
  sealed trait manage_pages extends _Permissions
  @scala.inline
  def manage_pages: manage_pages = "manage_pages".asInstanceOf[manage_pages]
  
  @js.native
  sealed trait native
    extends ShareDialogMode
       with ShareDialogModeAndroid
  @scala.inline
  def native: native = "native".asInstanceOf[native]
  
  @js.native
  sealed trait native_only extends LoginBehaviorAndroid
  @scala.inline
  def native_only: native_only = "native_only".asInstanceOf[native_only]
  
  @js.native
  sealed trait native_with_fallback extends LoginBehaviorAndroid
  @scala.inline
  def native_with_fallback: native_with_fallback = "native_with_fallback".asInstanceOf[native_with_fallback]
  
  @js.native
  sealed trait number extends OpenGraphValueType
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait only_me extends DefaultAudience
  @scala.inline
  def only_me: only_me = "only_me".asInstanceOf[only_me]
  
  @js.native
  sealed trait `open-graph` extends StObject
  @scala.inline
  def `open-graph`: `open-graph` = "open-graph".asInstanceOf[`open-graph`]
  
  @js.native
  sealed trait `open-graph-object` extends OpenGraphValueType
  @scala.inline
  def `open-graph-object`: `open-graph-object` = "open-graph-object".asInstanceOf[`open-graph-object`]
  
  @js.native
  sealed trait open_graph extends ObjectIdActionType
  @scala.inline
  def open_graph: open_graph = "open_graph".asInstanceOf[open_graph]
  
  @js.native
  sealed trait page extends ObjectIdActionType
  @scala.inline
  def page: page = "page".asInstanceOf[page]
  
  @js.native
  sealed trait pages_manage_cta extends _Permissions
  @scala.inline
  def pages_manage_cta: pages_manage_cta = "pages_manage_cta".asInstanceOf[pages_manage_cta]
  
  @js.native
  sealed trait pages_manage_instant_articles extends _Permissions
  @scala.inline
  def pages_manage_instant_articles: pages_manage_instant_articles = "pages_manage_instant_articles".asInstanceOf[pages_manage_instant_articles]
  
  @js.native
  sealed trait pages_messaging extends _Permissions
  @scala.inline
  def pages_messaging: pages_messaging = "pages_messaging".asInstanceOf[pages_messaging]
  
  @js.native
  sealed trait pages_messaging_payments extends _Permissions
  @scala.inline
  def pages_messaging_payments: pages_messaging_payments = "pages_messaging_payments".asInstanceOf[pages_messaging_payments]
  
  @js.native
  sealed trait pages_messaging_phone_number extends _Permissions
  @scala.inline
  def pages_messaging_phone_number: pages_messaging_phone_number = "pages_messaging_phone_number".asInstanceOf[pages_messaging_phone_number]
  
  @js.native
  sealed trait pages_messaging_subscriptions extends _Permissions
  @scala.inline
  def pages_messaging_subscriptions: pages_messaging_subscriptions = "pages_messaging_subscriptions".asInstanceOf[pages_messaging_subscriptions]
  
  @js.native
  sealed trait pages_show_list extends _Permissions
  @scala.inline
  def pages_show_list: pages_show_list = "pages_show_list".asInstanceOf[pages_show_list]
  
  @js.native
  sealed trait photo extends OpenGraphValueType
  @scala.inline
  def photo: photo = "photo".asInstanceOf[photo]
  
  @js.native
  sealed trait public_profile extends _Permissions
  @scala.inline
  def public_profile: public_profile = "public_profile".asInstanceOf[public_profile]
  
  @js.native
  sealed trait publish_actions extends _Permissions
  @scala.inline
  def publish_actions: publish_actions = "publish_actions".asInstanceOf[publish_actions]
  
  @js.native
  sealed trait publish_pages extends _Permissions
  @scala.inline
  def publish_pages: publish_pages = "publish_pages".asInstanceOf[publish_pages]
  
  @js.native
  sealed trait read_audience_network_insights extends _Permissions
  @scala.inline
  def read_audience_network_insights: read_audience_network_insights = "read_audience_network_insights".asInstanceOf[read_audience_network_insights]
  
  @js.native
  sealed trait read_custom_friendlists extends _Permissions
  @scala.inline
  def read_custom_friendlists: read_custom_friendlists = "read_custom_friendlists".asInstanceOf[read_custom_friendlists]
  
  @js.native
  sealed trait read_insights extends _Permissions
  @scala.inline
  def read_insights: read_insights = "read_insights".asInstanceOf[read_insights]
  
  @js.native
  sealed trait read_page_mailboxes extends _Permissions
  @scala.inline
  def read_page_mailboxes: read_page_mailboxes = "read_page_mailboxes".asInstanceOf[read_page_mailboxes]
  
  @js.native
  sealed trait right extends HorizontalAlignment
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait rsvp_event extends _Permissions
  @scala.inline
  def rsvp_event: rsvp_event = "rsvp_event".asInstanceOf[rsvp_event]
  
  @js.native
  sealed trait send extends GameRequestActionType
  @scala.inline
  def send: send = "send".asInstanceOf[send]
  
  @js.native
  sealed trait string extends OpenGraphValueType
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait top extends AuxiliaryViewPosition
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait turn extends GameRequestActionType
  @scala.inline
  def turn: turn = "turn".asInstanceOf[turn]
  
  @js.native
  sealed trait unknown extends ObjectIdActionType
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait user_about_me extends _Permissions
  @scala.inline
  def user_about_me: user_about_me = "user_about_me".asInstanceOf[user_about_me]
  
  @js.native
  sealed trait user_actionsDotbooks extends _Permissions
  @scala.inline
  def user_actionsDotbooks: user_actionsDotbooks = "user_actions.books".asInstanceOf[user_actionsDotbooks]
  
  @js.native
  sealed trait user_actionsDotfitness extends _Permissions
  @scala.inline
  def user_actionsDotfitness: user_actionsDotfitness = "user_actions.fitness".asInstanceOf[user_actionsDotfitness]
  
  @js.native
  sealed trait user_actionsDotmusic extends _Permissions
  @scala.inline
  def user_actionsDotmusic: user_actionsDotmusic = "user_actions.music".asInstanceOf[user_actionsDotmusic]
  
  @js.native
  sealed trait user_actionsDotnews extends _Permissions
  @scala.inline
  def user_actionsDotnews: user_actionsDotnews = "user_actions.news".asInstanceOf[user_actionsDotnews]
  
  @js.native
  sealed trait user_actionsDotvideo extends _Permissions
  @scala.inline
  def user_actionsDotvideo: user_actionsDotvideo = "user_actions.video".asInstanceOf[user_actionsDotvideo]
  
  @js.native
  sealed trait user_birthday extends _Permissions
  @scala.inline
  def user_birthday: user_birthday = "user_birthday".asInstanceOf[user_birthday]
  
  @js.native
  sealed trait user_education_history extends _Permissions
  @scala.inline
  def user_education_history: user_education_history = "user_education_history".asInstanceOf[user_education_history]
  
  @js.native
  sealed trait user_events extends _Permissions
  @scala.inline
  def user_events: user_events = "user_events".asInstanceOf[user_events]
  
  @js.native
  sealed trait user_friends extends _Permissions
  @scala.inline
  def user_friends: user_friends = "user_friends".asInstanceOf[user_friends]
  
  @js.native
  sealed trait user_games_activity extends _Permissions
  @scala.inline
  def user_games_activity: user_games_activity = "user_games_activity".asInstanceOf[user_games_activity]
  
  @js.native
  sealed trait user_hometown extends _Permissions
  @scala.inline
  def user_hometown: user_hometown = "user_hometown".asInstanceOf[user_hometown]
  
  @js.native
  sealed trait user_likes extends _Permissions
  @scala.inline
  def user_likes: user_likes = "user_likes".asInstanceOf[user_likes]
  
  @js.native
  sealed trait user_location extends _Permissions
  @scala.inline
  def user_location: user_location = "user_location".asInstanceOf[user_location]
  
  @js.native
  sealed trait user_managed_groups extends _Permissions
  @scala.inline
  def user_managed_groups: user_managed_groups = "user_managed_groups".asInstanceOf[user_managed_groups]
  
  @js.native
  sealed trait user_photos extends _Permissions
  @scala.inline
  def user_photos: user_photos = "user_photos".asInstanceOf[user_photos]
  
  @js.native
  sealed trait user_posts extends _Permissions
  @scala.inline
  def user_posts: user_posts = "user_posts".asInstanceOf[user_posts]
  
  @js.native
  sealed trait user_relationship_details extends _Permissions
  @scala.inline
  def user_relationship_details: user_relationship_details = "user_relationship_details".asInstanceOf[user_relationship_details]
  
  @js.native
  sealed trait user_relationships extends _Permissions
  @scala.inline
  def user_relationships: user_relationships = "user_relationships".asInstanceOf[user_relationships]
  
  @js.native
  sealed trait user_religion_politics extends _Permissions
  @scala.inline
  def user_religion_politics: user_religion_politics = "user_religion_politics".asInstanceOf[user_religion_politics]
  
  @js.native
  sealed trait user_tagged_places extends _Permissions
  @scala.inline
  def user_tagged_places: user_tagged_places = "user_tagged_places".asInstanceOf[user_tagged_places]
  
  @js.native
  sealed trait user_videos extends _Permissions
  @scala.inline
  def user_videos: user_videos = "user_videos".asInstanceOf[user_videos]
  
  @js.native
  sealed trait user_website extends _Permissions
  @scala.inline
  def user_website: user_website = "user_website".asInstanceOf[user_website]
  
  @js.native
  sealed trait user_work_history extends _Permissions
  @scala.inline
  def user_work_history: user_work_history = "user_work_history".asInstanceOf[user_work_history]
  
  @js.native
  sealed trait video extends StObject
  @scala.inline
  def video: video = "video".asInstanceOf[video]
  
  @js.native
  sealed trait web
    extends ShareDialogMode
       with ShareDialogModeAndroid
  @scala.inline
  def web: web = "web".asInstanceOf[web]
  
  @js.native
  sealed trait web_only extends LoginBehaviorAndroid
  @scala.inline
  def web_only: web_only = "web_only".asInstanceOf[web_only]
  
  @js.native
  sealed trait webview
    extends ShareDialogMode
       with ShareDialogModeIOS
  @scala.inline
  def webview: webview = "webview".asInstanceOf[webview]
}
