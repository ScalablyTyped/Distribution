package typings.shopifyDashPrime

import typings.shopifyDashPrime.distEnumsAuthUnderscoreScopeMod._AuthScope
import typings.shopifyDashPrime.distEnumsBlogUnderscoreCommentableMod._BlogCommentable
import typings.shopifyDashPrime.distEnumsFinancialUnderscoreStatusMod._FinancialStatus
import typings.shopifyDashPrime.distEnumsFulfillmentUnderscoreStatusMod._FulfillmentStatus
import typings.shopifyDashPrime.distEnumsInventoryUnderscoreBehaviorMod._InventoryBehavior
import typings.shopifyDashPrime.distEnumsOrderUnderscoreCancelUnderscoreReasonMod._OrderCancelReason
import typings.shopifyDashPrime.distEnumsOrderUnderscoreStatusMod._OrderStatus
import typings.shopifyDashPrime.distEnumsPublishedUnderscoreStatusMod._PublishedStatus
import typings.shopifyDashPrime.distEnumsScriptUnderscoreTagUnderscoreDisplayUnderscoreScopeMod._ScriptTagDisplayScope
import typings.shopifyDashPrime.distEnumsTransactionUnderscoreKindMod._TransactionKind
import typings.shopifyDashPrime.distEnumsTransactionUnderscoreStatusMod._TransactionStatus
import typings.shopifyDashPrime.distEnumsWebhookUnderscoreTopicMod._WebhookTopic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object shopifyDashPrimeStrings {
  @js.native
  sealed trait DELETE extends js.Object
  
  @js.native
  sealed trait GET extends js.Object
  
  @js.native
  sealed trait POST extends js.Object
  
  @js.native
  sealed trait PUT extends js.Object
  
  @js.native
  sealed trait accepted extends js.Object
  
  @js.native
  sealed trait across extends js.Object
  
  @js.native
  sealed trait active extends js.Object
  
  @js.native
  sealed trait all extends _ScriptTagDisplayScope
  
  @js.native
  sealed trait any
    extends _FinancialStatus
       with _FulfillmentStatus
       with _OrderStatus
       with _PublishedStatus
  
  @js.native
  sealed trait appSlashuninstalled extends _WebhookTopic
  
  @js.native
  sealed trait applies_to_resource extends js.Object
  
  @js.native
  sealed trait authorization extends _TransactionKind
  
  @js.native
  sealed trait authorized extends _FinancialStatus
  
  @js.native
  sealed trait bypass extends _InventoryBehavior
  
  @js.native
  sealed trait cancelled extends _OrderStatus
  
  @js.native
  sealed trait capture extends _TransactionKind
  
  @js.native
  sealed trait cartsSlashcreate extends _WebhookTopic
  
  @js.native
  sealed trait cartsSlashupdate extends _WebhookTopic
  
  @js.native
  sealed trait checkoutsSlashcreate extends _WebhookTopic
  
  @js.native
  sealed trait checkoutsSlashdelete extends _WebhookTopic
  
  @js.native
  sealed trait checkoutsSlashupdate extends _WebhookTopic
  
  @js.native
  sealed trait closed extends _OrderStatus
  
  @js.native
  sealed trait collectionsSlashcreate extends _WebhookTopic
  
  @js.native
  sealed trait collectionsSlashdelete extends _WebhookTopic
  
  @js.native
  sealed trait collectionsSlashupdate extends _WebhookTopic
  
  @js.native
  sealed trait custom_collection extends js.Object
  
  @js.native
  sealed trait customer extends _OrderCancelReason
  
  @js.native
  sealed trait customer_groupsSlashcreate extends _WebhookTopic
  
  @js.native
  sealed trait customer_groupsSlashdelete extends _WebhookTopic
  
  @js.native
  sealed trait customer_groupsSlashupdate extends _WebhookTopic
  
  @js.native
  sealed trait customersSlashcreate extends _WebhookTopic
  
  @js.native
  sealed trait customersSlashdelete extends _WebhookTopic
  
  @js.native
  sealed trait customersSlashdisable extends _WebhookTopic
  
  @js.native
  sealed trait customersSlashenable extends _WebhookTopic
  
  @js.native
  sealed trait customersSlashupdate extends _WebhookTopic
  
  @js.native
  sealed trait declined extends js.Object
  
  @js.native
  sealed trait decrement_ignoring_policy extends _InventoryBehavior
  
  @js.native
  sealed trait decrement_obeying_policy extends _InventoryBehavior
  
  @js.native
  sealed trait demo extends js.Object
  
  @js.native
  sealed trait disputesSlashcreate extends _WebhookTopic
  
  @js.native
  sealed trait disputesSlashupdate extends _WebhookTopic
  
  @js.native
  sealed trait each extends js.Object
  
  @js.native
  sealed trait entitled extends js.Object
  
  @js.native
  sealed trait error extends _TransactionStatus
  
  @js.native
  sealed trait expired extends js.Object
  
  @js.native
  sealed trait failure extends _TransactionStatus
  
  @js.native
  sealed trait fixed_amount extends js.Object
  
  @js.native
  sealed trait fraud extends _OrderCancelReason
  
  @js.native
  sealed trait fulfilled extends js.Object
  
  @js.native
  sealed trait fulfillmentsSlashcreate extends _WebhookTopic
  
  @js.native
  sealed trait fulfillmentsSlashupdate extends _WebhookTopic
  
  @js.native
  sealed trait integer extends js.Object
  
  @js.native
  sealed trait inventory extends _OrderCancelReason
  
  @js.native
  sealed trait json extends js.Object
  
  @js.native
  sealed trait line_item extends js.Object
  
  @js.native
  sealed trait main extends js.Object
  
  @js.native
  sealed trait moderate extends _BlogCommentable
  
  @js.native
  sealed trait no extends _BlogCommentable
  
  @js.native
  sealed trait online_store extends _ScriptTagDisplayScope
  
  @js.native
  sealed trait onload extends js.Object
  
  @js.native
  sealed trait open extends _OrderStatus
  
  @js.native
  sealed trait order_status extends _ScriptTagDisplayScope
  
  @js.native
  sealed trait order_transationsSlashcreate extends _WebhookTopic
  
  @js.native
  sealed trait ordersSlashcancelled extends _WebhookTopic
  
  @js.native
  sealed trait ordersSlashcreate extends _WebhookTopic
  
  @js.native
  sealed trait ordersSlashdelete extends _WebhookTopic
  
  @js.native
  sealed trait ordersSlashfulfilled extends _WebhookTopic
  
  @js.native
  sealed trait ordersSlashpaid extends _WebhookTopic
  
  @js.native
  sealed trait ordersSlashpartially_fulfilled extends _WebhookTopic
  
  @js.native
  sealed trait ordersSlashupdated extends _WebhookTopic
  
  @js.native
  sealed trait other extends _OrderCancelReason
  
  @js.native
  sealed trait paid extends _FinancialStatus
  
  @js.native
  sealed trait partial extends _FulfillmentStatus
  
  @js.native
  sealed trait partially_paid extends _FinancialStatus
  
  @js.native
  sealed trait partially_refunded extends _FinancialStatus
  
  @js.native
  sealed trait pending
    extends _FinancialStatus
       with _TransactionStatus
  
  @js.native
  sealed trait `per-user` extends js.Object
  
  @js.native
  sealed trait percentage extends js.Object
  
  @js.native
  sealed trait prerequisite extends js.Object
  
  @js.native
  sealed trait productsSlashcreate extends _WebhookTopic
  
  @js.native
  sealed trait productsSlashdelete extends _WebhookTopic
  
  @js.native
  sealed trait productsSlashupdate extends _WebhookTopic
  
  @js.native
  sealed trait published extends _PublishedStatus
  
  @js.native
  sealed trait read_analytics extends _AuthScope
  
  @js.native
  sealed trait read_content extends _AuthScope
  
  @js.native
  sealed trait read_customers extends _AuthScope
  
  @js.native
  sealed trait read_fulfillments extends _AuthScope
  
  @js.native
  sealed trait read_orders extends _AuthScope
  
  @js.native
  sealed trait read_products extends _AuthScope
  
  @js.native
  sealed trait read_script_tags extends _AuthScope
  
  @js.native
  sealed trait read_shipping extends _AuthScope
  
  @js.native
  sealed trait read_themes extends _AuthScope
  
  @js.native
  sealed trait read_users extends _AuthScope
  
  @js.native
  sealed trait refund extends _TransactionKind
  
  @js.native
  sealed trait refunded extends _FinancialStatus
  
  @js.native
  sealed trait refundsSlashcreate extends _WebhookTopic
  
  @js.native
  sealed trait sale extends _TransactionKind
  
  @js.native
  sealed trait shipped extends _FulfillmentStatus
  
  @js.native
  sealed trait shipping extends js.Object
  
  @js.native
  sealed trait shipping_line extends js.Object
  
  @js.native
  sealed trait shopSlashupdate extends _WebhookTopic
  
  @js.native
  sealed trait string extends js.Object
  
  @js.native
  sealed trait success extends _TransactionStatus
  
  @js.native
  sealed trait themesSlashpublish extends _WebhookTopic
  
  @js.native
  sealed trait unpaid extends _FinancialStatus
  
  @js.native
  sealed trait unpublished extends _PublishedStatus
  
  @js.native
  sealed trait unshipped extends _FulfillmentStatus
  
  @js.native
  sealed trait void extends _TransactionKind
  
  @js.native
  sealed trait voided extends _FinancialStatus
  
  @js.native
  sealed trait write_content extends _AuthScope
  
  @js.native
  sealed trait write_customers extends _AuthScope
  
  @js.native
  sealed trait write_fulfillments extends _AuthScope
  
  @js.native
  sealed trait write_orders extends _AuthScope
  
  @js.native
  sealed trait write_products extends _AuthScope
  
  @js.native
  sealed trait write_script_tags extends _AuthScope
  
  @js.native
  sealed trait write_shipping extends _AuthScope
  
  @js.native
  sealed trait write_themes extends _AuthScope
  
  @js.native
  sealed trait write_users extends _AuthScope
  
  @js.native
  sealed trait xml extends js.Object
  
  @js.native
  sealed trait yes extends _BlogCommentable
  
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  @scala.inline
  def accepted: accepted = "accepted".asInstanceOf[accepted]
  @scala.inline
  def across: across = "across".asInstanceOf[across]
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def any: any = "any".asInstanceOf[any]
  @scala.inline
  def appSlashuninstalled: appSlashuninstalled = "app/uninstalled".asInstanceOf[appSlashuninstalled]
  @scala.inline
  def applies_to_resource: applies_to_resource = "applies_to_resource".asInstanceOf[applies_to_resource]
  @scala.inline
  def authorization: authorization = "authorization".asInstanceOf[authorization]
  @scala.inline
  def authorized: authorized = "authorized".asInstanceOf[authorized]
  @scala.inline
  def bypass: bypass = "bypass".asInstanceOf[bypass]
  @scala.inline
  def cancelled: cancelled = "cancelled".asInstanceOf[cancelled]
  @scala.inline
  def capture: capture = "capture".asInstanceOf[capture]
  @scala.inline
  def cartsSlashcreate: cartsSlashcreate = "carts/create".asInstanceOf[cartsSlashcreate]
  @scala.inline
  def cartsSlashupdate: cartsSlashupdate = "carts/update".asInstanceOf[cartsSlashupdate]
  @scala.inline
  def checkoutsSlashcreate: checkoutsSlashcreate = "checkouts/create".asInstanceOf[checkoutsSlashcreate]
  @scala.inline
  def checkoutsSlashdelete: checkoutsSlashdelete = "checkouts/delete".asInstanceOf[checkoutsSlashdelete]
  @scala.inline
  def checkoutsSlashupdate: checkoutsSlashupdate = "checkouts/update".asInstanceOf[checkoutsSlashupdate]
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  @scala.inline
  def collectionsSlashcreate: collectionsSlashcreate = "collections/create".asInstanceOf[collectionsSlashcreate]
  @scala.inline
  def collectionsSlashdelete: collectionsSlashdelete = "collections/delete".asInstanceOf[collectionsSlashdelete]
  @scala.inline
  def collectionsSlashupdate: collectionsSlashupdate = "collections/update".asInstanceOf[collectionsSlashupdate]
  @scala.inline
  def custom_collection: custom_collection = "custom_collection".asInstanceOf[custom_collection]
  @scala.inline
  def customer: customer = "customer".asInstanceOf[customer]
  @scala.inline
  def customer_groupsSlashcreate: customer_groupsSlashcreate = "customer_groups/create".asInstanceOf[customer_groupsSlashcreate]
  @scala.inline
  def customer_groupsSlashdelete: customer_groupsSlashdelete = "customer_groups/delete".asInstanceOf[customer_groupsSlashdelete]
  @scala.inline
  def customer_groupsSlashupdate: customer_groupsSlashupdate = "customer_groups/update".asInstanceOf[customer_groupsSlashupdate]
  @scala.inline
  def customersSlashcreate: customersSlashcreate = "customers/create".asInstanceOf[customersSlashcreate]
  @scala.inline
  def customersSlashdelete: customersSlashdelete = "customers/delete".asInstanceOf[customersSlashdelete]
  @scala.inline
  def customersSlashdisable: customersSlashdisable = "customers/disable".asInstanceOf[customersSlashdisable]
  @scala.inline
  def customersSlashenable: customersSlashenable = "customers/enable".asInstanceOf[customersSlashenable]
  @scala.inline
  def customersSlashupdate: customersSlashupdate = "customers/update".asInstanceOf[customersSlashupdate]
  @scala.inline
  def declined: declined = "declined".asInstanceOf[declined]
  @scala.inline
  def decrement_ignoring_policy: decrement_ignoring_policy = "decrement_ignoring_policy".asInstanceOf[decrement_ignoring_policy]
  @scala.inline
  def decrement_obeying_policy: decrement_obeying_policy = "decrement_obeying_policy".asInstanceOf[decrement_obeying_policy]
  @scala.inline
  def demo: demo = "demo".asInstanceOf[demo]
  @scala.inline
  def disputesSlashcreate: disputesSlashcreate = "disputes/create".asInstanceOf[disputesSlashcreate]
  @scala.inline
  def disputesSlashupdate: disputesSlashupdate = "disputes/update".asInstanceOf[disputesSlashupdate]
  @scala.inline
  def each: each = "each".asInstanceOf[each]
  @scala.inline
  def entitled: entitled = "entitled".asInstanceOf[entitled]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def expired: expired = "expired".asInstanceOf[expired]
  @scala.inline
  def failure: failure = "failure".asInstanceOf[failure]
  @scala.inline
  def fixed_amount: fixed_amount = "fixed_amount".asInstanceOf[fixed_amount]
  @scala.inline
  def fraud: fraud = "fraud".asInstanceOf[fraud]
  @scala.inline
  def fulfilled: fulfilled = "fulfilled".asInstanceOf[fulfilled]
  @scala.inline
  def fulfillmentsSlashcreate: fulfillmentsSlashcreate = "fulfillments/create".asInstanceOf[fulfillmentsSlashcreate]
  @scala.inline
  def fulfillmentsSlashupdate: fulfillmentsSlashupdate = "fulfillments/update".asInstanceOf[fulfillmentsSlashupdate]
  @scala.inline
  def integer: integer = "integer".asInstanceOf[integer]
  @scala.inline
  def inventory: inventory = "inventory".asInstanceOf[inventory]
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def line_item: line_item = "line_item".asInstanceOf[line_item]
  @scala.inline
  def main: main = "main".asInstanceOf[main]
  @scala.inline
  def moderate: moderate = "moderate".asInstanceOf[moderate]
  @scala.inline
  def no: no = "no".asInstanceOf[no]
  @scala.inline
  def online_store: online_store = "online_store".asInstanceOf[online_store]
  @scala.inline
  def onload: onload = "onload".asInstanceOf[onload]
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  @scala.inline
  def order_status: order_status = "order_status".asInstanceOf[order_status]
  @scala.inline
  def order_transationsSlashcreate: order_transationsSlashcreate = "order_transations/create".asInstanceOf[order_transationsSlashcreate]
  @scala.inline
  def ordersSlashcancelled: ordersSlashcancelled = "orders/cancelled".asInstanceOf[ordersSlashcancelled]
  @scala.inline
  def ordersSlashcreate: ordersSlashcreate = "orders/create".asInstanceOf[ordersSlashcreate]
  @scala.inline
  def ordersSlashdelete: ordersSlashdelete = "orders/delete".asInstanceOf[ordersSlashdelete]
  @scala.inline
  def ordersSlashfulfilled: ordersSlashfulfilled = "orders/fulfilled".asInstanceOf[ordersSlashfulfilled]
  @scala.inline
  def ordersSlashpaid: ordersSlashpaid = "orders/paid".asInstanceOf[ordersSlashpaid]
  @scala.inline
  def ordersSlashpartially_fulfilled: ordersSlashpartially_fulfilled = "orders/partially_fulfilled".asInstanceOf[ordersSlashpartially_fulfilled]
  @scala.inline
  def ordersSlashupdated: ordersSlashupdated = "orders/updated".asInstanceOf[ordersSlashupdated]
  @scala.inline
  def other: other = "other".asInstanceOf[other]
  @scala.inline
  def paid: paid = "paid".asInstanceOf[paid]
  @scala.inline
  def partial: partial = "partial".asInstanceOf[partial]
  @scala.inline
  def partially_paid: partially_paid = "partially_paid".asInstanceOf[partially_paid]
  @scala.inline
  def partially_refunded: partially_refunded = "partially_refunded".asInstanceOf[partially_refunded]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def `per-user`: `per-user` = "per-user".asInstanceOf[`per-user`]
  @scala.inline
  def percentage: percentage = "percentage".asInstanceOf[percentage]
  @scala.inline
  def prerequisite: prerequisite = "prerequisite".asInstanceOf[prerequisite]
  @scala.inline
  def productsSlashcreate: productsSlashcreate = "products/create".asInstanceOf[productsSlashcreate]
  @scala.inline
  def productsSlashdelete: productsSlashdelete = "products/delete".asInstanceOf[productsSlashdelete]
  @scala.inline
  def productsSlashupdate: productsSlashupdate = "products/update".asInstanceOf[productsSlashupdate]
  @scala.inline
  def published: published = "published".asInstanceOf[published]
  @scala.inline
  def read_analytics: read_analytics = "read_analytics".asInstanceOf[read_analytics]
  @scala.inline
  def read_content: read_content = "read_content".asInstanceOf[read_content]
  @scala.inline
  def read_customers: read_customers = "read_customers".asInstanceOf[read_customers]
  @scala.inline
  def read_fulfillments: read_fulfillments = "read_fulfillments".asInstanceOf[read_fulfillments]
  @scala.inline
  def read_orders: read_orders = "read_orders".asInstanceOf[read_orders]
  @scala.inline
  def read_products: read_products = "read_products".asInstanceOf[read_products]
  @scala.inline
  def read_script_tags: read_script_tags = "read_script_tags".asInstanceOf[read_script_tags]
  @scala.inline
  def read_shipping: read_shipping = "read_shipping".asInstanceOf[read_shipping]
  @scala.inline
  def read_themes: read_themes = "read_themes".asInstanceOf[read_themes]
  @scala.inline
  def read_users: read_users = "read_users".asInstanceOf[read_users]
  @scala.inline
  def refund: refund = "refund".asInstanceOf[refund]
  @scala.inline
  def refunded: refunded = "refunded".asInstanceOf[refunded]
  @scala.inline
  def refundsSlashcreate: refundsSlashcreate = "refunds/create".asInstanceOf[refundsSlashcreate]
  @scala.inline
  def sale: sale = "sale".asInstanceOf[sale]
  @scala.inline
  def shipped: shipped = "shipped".asInstanceOf[shipped]
  @scala.inline
  def shipping: shipping = "shipping".asInstanceOf[shipping]
  @scala.inline
  def shipping_line: shipping_line = "shipping_line".asInstanceOf[shipping_line]
  @scala.inline
  def shopSlashupdate: shopSlashupdate = "shop/update".asInstanceOf[shopSlashupdate]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  @scala.inline
  def themesSlashpublish: themesSlashpublish = "themes/publish".asInstanceOf[themesSlashpublish]
  @scala.inline
  def unpaid: unpaid = "unpaid".asInstanceOf[unpaid]
  @scala.inline
  def unpublished: unpublished = "unpublished".asInstanceOf[unpublished]
  @scala.inline
  def unshipped: unshipped = "unshipped".asInstanceOf[unshipped]
  @scala.inline
  def void: void = "void".asInstanceOf[void]
  @scala.inline
  def voided: voided = "voided".asInstanceOf[voided]
  @scala.inline
  def write_content: write_content = "write_content".asInstanceOf[write_content]
  @scala.inline
  def write_customers: write_customers = "write_customers".asInstanceOf[write_customers]
  @scala.inline
  def write_fulfillments: write_fulfillments = "write_fulfillments".asInstanceOf[write_fulfillments]
  @scala.inline
  def write_orders: write_orders = "write_orders".asInstanceOf[write_orders]
  @scala.inline
  def write_products: write_products = "write_products".asInstanceOf[write_products]
  @scala.inline
  def write_script_tags: write_script_tags = "write_script_tags".asInstanceOf[write_script_tags]
  @scala.inline
  def write_shipping: write_shipping = "write_shipping".asInstanceOf[write_shipping]
  @scala.inline
  def write_themes: write_themes = "write_themes".asInstanceOf[write_themes]
  @scala.inline
  def write_users: write_users = "write_users".asInstanceOf[write_users]
  @scala.inline
  def xml: xml = "xml".asInstanceOf[xml]
  @scala.inline
  def yes: yes = "yes".asInstanceOf[yes]
}

