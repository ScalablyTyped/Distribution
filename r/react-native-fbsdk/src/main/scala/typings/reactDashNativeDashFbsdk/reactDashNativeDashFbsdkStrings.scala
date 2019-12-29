package typings.reactDashNativeDashFbsdk

import typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod.AppEventsFlushBehavior
import typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod.AppGroupPrivacy
import typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod.AuxiliaryViewPosition
import typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod.DefaultAudience
import typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod.GameRequestActionType
import typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod.GameRequestFilters
import typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod.HorizontalAlignment
import typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod.LoginBehaviorAndroid
import typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod.ObjectIdActionType
import typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod.OpenGraphValueType
import typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod.ShareDialogMode
import typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod.ShareDialogModeAndroid
import typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod.ShareDialogModeIOS
import typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod.TooltipBehaviorIOS
import typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod._Permissions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashNativeDashFbsdkStrings {
  @js.native
  sealed trait Closed extends AppGroupPrivacy
  
  @js.native
  sealed trait Open extends AppGroupPrivacy
  
  @js.native
  sealed trait ads_management extends _Permissions
  
  @js.native
  sealed trait ads_read extends _Permissions
  
  @js.native
  sealed trait app_non_users extends GameRequestFilters
  
  @js.native
  sealed trait app_users extends GameRequestFilters
  
  @js.native
  sealed trait askfor extends GameRequestActionType
  
  @js.native
  sealed trait auto
    extends AppEventsFlushBehavior
       with TooltipBehaviorIOS
  
  @js.native
  sealed trait automatic
    extends ShareDialogMode
       with ShareDialogModeAndroid
       with ShareDialogModeIOS
  
  @js.native
  sealed trait bottom extends AuxiliaryViewPosition
  
  @js.native
  sealed trait browser
    extends ShareDialogMode
       with ShareDialogModeIOS
  
  @js.native
  sealed trait business_management extends _Permissions
  
  @js.native
  sealed trait center extends HorizontalAlignment
  
  @js.native
  sealed trait disable extends TooltipBehaviorIOS
  
  @js.native
  sealed trait email extends _Permissions
  
  @js.native
  sealed trait everyone extends DefaultAudience
  
  @js.native
  sealed trait `explicitly-only` extends AppEventsFlushBehavior
  
  @js.native
  sealed trait feed
    extends ShareDialogMode
       with ShareDialogModeAndroid
  
  @js.native
  sealed trait force_display extends TooltipBehaviorIOS
  
  @js.native
  sealed trait friends extends DefaultAudience
  
  @js.native
  sealed trait `inline` extends AuxiliaryViewPosition
  
  @js.native
  sealed trait left extends HorizontalAlignment
  
  @js.native
  sealed trait link extends js.Object
  
  @js.native
  sealed trait manage_pages extends _Permissions
  
  @js.native
  sealed trait native
    extends ShareDialogMode
       with ShareDialogModeAndroid
  
  @js.native
  sealed trait native_only extends LoginBehaviorAndroid
  
  @js.native
  sealed trait native_with_fallback extends LoginBehaviorAndroid
  
  @js.native
  sealed trait number extends OpenGraphValueType
  
  @js.native
  sealed trait only_me extends DefaultAudience
  
  @js.native
  sealed trait `open-graph` extends js.Object
  
  @js.native
  sealed trait `open-graph-object` extends OpenGraphValueType
  
  @js.native
  sealed trait open_graph extends ObjectIdActionType
  
  @js.native
  sealed trait page extends ObjectIdActionType
  
  @js.native
  sealed trait pages_manage_cta extends _Permissions
  
  @js.native
  sealed trait pages_manage_instant_articles extends _Permissions
  
  @js.native
  sealed trait pages_messaging extends _Permissions
  
  @js.native
  sealed trait pages_messaging_payments extends _Permissions
  
  @js.native
  sealed trait pages_messaging_phone_number extends _Permissions
  
  @js.native
  sealed trait pages_messaging_subscriptions extends _Permissions
  
  @js.native
  sealed trait pages_show_list extends _Permissions
  
  @js.native
  sealed trait photo extends OpenGraphValueType
  
  @js.native
  sealed trait public_profile extends _Permissions
  
  @js.native
  sealed trait publish_actions extends _Permissions
  
  @js.native
  sealed trait publish_pages extends _Permissions
  
  @js.native
  sealed trait read_audience_network_insights extends _Permissions
  
  @js.native
  sealed trait read_custom_friendlists extends _Permissions
  
  @js.native
  sealed trait read_insights extends _Permissions
  
  @js.native
  sealed trait read_page_mailboxes extends _Permissions
  
  @js.native
  sealed trait right extends HorizontalAlignment
  
  @js.native
  sealed trait rsvp_event extends _Permissions
  
  @js.native
  sealed trait send extends GameRequestActionType
  
  @js.native
  sealed trait string extends OpenGraphValueType
  
  @js.native
  sealed trait top extends AuxiliaryViewPosition
  
  @js.native
  sealed trait turn extends GameRequestActionType
  
  @js.native
  sealed trait unknown extends ObjectIdActionType
  
  @js.native
  sealed trait user_about_me extends _Permissions
  
  @js.native
  sealed trait user_actionsDotbooks extends _Permissions
  
  @js.native
  sealed trait user_actionsDotfitness extends _Permissions
  
  @js.native
  sealed trait user_actionsDotmusic extends _Permissions
  
  @js.native
  sealed trait user_actionsDotnews extends _Permissions
  
  @js.native
  sealed trait user_actionsDotvideo extends _Permissions
  
  @js.native
  sealed trait user_birthday extends _Permissions
  
  @js.native
  sealed trait user_education_history extends _Permissions
  
  @js.native
  sealed trait user_events extends _Permissions
  
  @js.native
  sealed trait user_friends extends _Permissions
  
  @js.native
  sealed trait user_games_activity extends _Permissions
  
  @js.native
  sealed trait user_hometown extends _Permissions
  
  @js.native
  sealed trait user_likes extends _Permissions
  
  @js.native
  sealed trait user_location extends _Permissions
  
  @js.native
  sealed trait user_managed_groups extends _Permissions
  
  @js.native
  sealed trait user_photos extends _Permissions
  
  @js.native
  sealed trait user_posts extends _Permissions
  
  @js.native
  sealed trait user_relationship_details extends _Permissions
  
  @js.native
  sealed trait user_relationships extends _Permissions
  
  @js.native
  sealed trait user_religion_politics extends _Permissions
  
  @js.native
  sealed trait user_tagged_places extends _Permissions
  
  @js.native
  sealed trait user_videos extends _Permissions
  
  @js.native
  sealed trait user_website extends _Permissions
  
  @js.native
  sealed trait user_work_history extends _Permissions
  
  @js.native
  sealed trait video extends js.Object
  
  @js.native
  sealed trait web
    extends ShareDialogMode
       with ShareDialogModeAndroid
  
  @js.native
  sealed trait web_only extends LoginBehaviorAndroid
  
  @js.native
  sealed trait webview
    extends ShareDialogMode
       with ShareDialogModeIOS
  
  @scala.inline
  def Closed: Closed = "Closed".asInstanceOf[Closed]
  @scala.inline
  def Open: Open = "Open".asInstanceOf[Open]
  @scala.inline
  def ads_management: ads_management = "ads_management".asInstanceOf[ads_management]
  @scala.inline
  def ads_read: ads_read = "ads_read".asInstanceOf[ads_read]
  @scala.inline
  def app_non_users: app_non_users = "app_non_users".asInstanceOf[app_non_users]
  @scala.inline
  def app_users: app_users = "app_users".asInstanceOf[app_users]
  @scala.inline
  def askfor: askfor = "askfor".asInstanceOf[askfor]
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def automatic: automatic = "automatic".asInstanceOf[automatic]
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def browser: browser = "browser".asInstanceOf[browser]
  @scala.inline
  def business_management: business_management = "business_management".asInstanceOf[business_management]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def disable: disable = "disable".asInstanceOf[disable]
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  @scala.inline
  def everyone: everyone = "everyone".asInstanceOf[everyone]
  @scala.inline
  def `explicitly-only`: `explicitly-only` = "explicitly-only".asInstanceOf[`explicitly-only`]
  @scala.inline
  def feed: feed = "feed".asInstanceOf[feed]
  @scala.inline
  def force_display: force_display = "force_display".asInstanceOf[force_display]
  @scala.inline
  def friends: friends = "friends".asInstanceOf[friends]
  @scala.inline
  def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def link: link = "link".asInstanceOf[link]
  @scala.inline
  def manage_pages: manage_pages = "manage_pages".asInstanceOf[manage_pages]
  @scala.inline
  def native: native = "native".asInstanceOf[native]
  @scala.inline
  def native_only: native_only = "native_only".asInstanceOf[native_only]
  @scala.inline
  def native_with_fallback: native_with_fallback = "native_with_fallback".asInstanceOf[native_with_fallback]
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  @scala.inline
  def only_me: only_me = "only_me".asInstanceOf[only_me]
  @scala.inline
  def `open-graph`: `open-graph` = "open-graph".asInstanceOf[`open-graph`]
  @scala.inline
  def `open-graph-object`: `open-graph-object` = "open-graph-object".asInstanceOf[`open-graph-object`]
  @scala.inline
  def open_graph: open_graph = "open_graph".asInstanceOf[open_graph]
  @scala.inline
  def page: page = "page".asInstanceOf[page]
  @scala.inline
  def pages_manage_cta: pages_manage_cta = "pages_manage_cta".asInstanceOf[pages_manage_cta]
  @scala.inline
  def pages_manage_instant_articles: pages_manage_instant_articles = "pages_manage_instant_articles".asInstanceOf[pages_manage_instant_articles]
  @scala.inline
  def pages_messaging: pages_messaging = "pages_messaging".asInstanceOf[pages_messaging]
  @scala.inline
  def pages_messaging_payments: pages_messaging_payments = "pages_messaging_payments".asInstanceOf[pages_messaging_payments]
  @scala.inline
  def pages_messaging_phone_number: pages_messaging_phone_number = "pages_messaging_phone_number".asInstanceOf[pages_messaging_phone_number]
  @scala.inline
  def pages_messaging_subscriptions: pages_messaging_subscriptions = "pages_messaging_subscriptions".asInstanceOf[pages_messaging_subscriptions]
  @scala.inline
  def pages_show_list: pages_show_list = "pages_show_list".asInstanceOf[pages_show_list]
  @scala.inline
  def photo: photo = "photo".asInstanceOf[photo]
  @scala.inline
  def public_profile: public_profile = "public_profile".asInstanceOf[public_profile]
  @scala.inline
  def publish_actions: publish_actions = "publish_actions".asInstanceOf[publish_actions]
  @scala.inline
  def publish_pages: publish_pages = "publish_pages".asInstanceOf[publish_pages]
  @scala.inline
  def read_audience_network_insights: read_audience_network_insights = "read_audience_network_insights".asInstanceOf[read_audience_network_insights]
  @scala.inline
  def read_custom_friendlists: read_custom_friendlists = "read_custom_friendlists".asInstanceOf[read_custom_friendlists]
  @scala.inline
  def read_insights: read_insights = "read_insights".asInstanceOf[read_insights]
  @scala.inline
  def read_page_mailboxes: read_page_mailboxes = "read_page_mailboxes".asInstanceOf[read_page_mailboxes]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def rsvp_event: rsvp_event = "rsvp_event".asInstanceOf[rsvp_event]
  @scala.inline
  def send: send = "send".asInstanceOf[send]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  @scala.inline
  def turn: turn = "turn".asInstanceOf[turn]
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  @scala.inline
  def user_about_me: user_about_me = "user_about_me".asInstanceOf[user_about_me]
  @scala.inline
  def user_actionsDotbooks: user_actionsDotbooks = "user_actions.books".asInstanceOf[user_actionsDotbooks]
  @scala.inline
  def user_actionsDotfitness: user_actionsDotfitness = "user_actions.fitness".asInstanceOf[user_actionsDotfitness]
  @scala.inline
  def user_actionsDotmusic: user_actionsDotmusic = "user_actions.music".asInstanceOf[user_actionsDotmusic]
  @scala.inline
  def user_actionsDotnews: user_actionsDotnews = "user_actions.news".asInstanceOf[user_actionsDotnews]
  @scala.inline
  def user_actionsDotvideo: user_actionsDotvideo = "user_actions.video".asInstanceOf[user_actionsDotvideo]
  @scala.inline
  def user_birthday: user_birthday = "user_birthday".asInstanceOf[user_birthday]
  @scala.inline
  def user_education_history: user_education_history = "user_education_history".asInstanceOf[user_education_history]
  @scala.inline
  def user_events: user_events = "user_events".asInstanceOf[user_events]
  @scala.inline
  def user_friends: user_friends = "user_friends".asInstanceOf[user_friends]
  @scala.inline
  def user_games_activity: user_games_activity = "user_games_activity".asInstanceOf[user_games_activity]
  @scala.inline
  def user_hometown: user_hometown = "user_hometown".asInstanceOf[user_hometown]
  @scala.inline
  def user_likes: user_likes = "user_likes".asInstanceOf[user_likes]
  @scala.inline
  def user_location: user_location = "user_location".asInstanceOf[user_location]
  @scala.inline
  def user_managed_groups: user_managed_groups = "user_managed_groups".asInstanceOf[user_managed_groups]
  @scala.inline
  def user_photos: user_photos = "user_photos".asInstanceOf[user_photos]
  @scala.inline
  def user_posts: user_posts = "user_posts".asInstanceOf[user_posts]
  @scala.inline
  def user_relationship_details: user_relationship_details = "user_relationship_details".asInstanceOf[user_relationship_details]
  @scala.inline
  def user_relationships: user_relationships = "user_relationships".asInstanceOf[user_relationships]
  @scala.inline
  def user_religion_politics: user_religion_politics = "user_religion_politics".asInstanceOf[user_religion_politics]
  @scala.inline
  def user_tagged_places: user_tagged_places = "user_tagged_places".asInstanceOf[user_tagged_places]
  @scala.inline
  def user_videos: user_videos = "user_videos".asInstanceOf[user_videos]
  @scala.inline
  def user_website: user_website = "user_website".asInstanceOf[user_website]
  @scala.inline
  def user_work_history: user_work_history = "user_work_history".asInstanceOf[user_work_history]
  @scala.inline
  def video: video = "video".asInstanceOf[video]
  @scala.inline
  def web: web = "web".asInstanceOf[web]
  @scala.inline
  def web_only: web_only = "web_only".asInstanceOf[web_only]
  @scala.inline
  def webview: webview = "webview".asInstanceOf[webview]
}

