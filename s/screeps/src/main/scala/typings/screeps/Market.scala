package typings.screeps

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// No static is available
/**
  * A global object representing the in-game market. You can use this object to track resource transactions to/from your
  * terminals, and your buy/sell orders. The object is accessible via the singleton Game.market property.
  */
@js.native
trait Market extends js.Object {
  /**
    * Your current credits balance.
    */
  var credits: Double = js.native
  /**
    * An array of the last 100 incoming transactions to your terminals
    */
  var incomingTransactions: js.Array[Transaction] = js.native
  /**
    * An object with your active and inactive buy/sell orders on the market.
    */
  var orders: StringDictionary[Order] = js.native
  /**
    * An array of the last 100 outgoing transactions from your terminals
    */
  var outgoingTransactions: js.Array[Transaction] = js.native
  /**
    * Estimate the energy transaction cost of StructureTerminal.send and Market.deal methods. The formula:
    *
    * ```
    * Math.ceil( amount * (Math.log(0.1*linearDistanceBetweenRooms + 0.9) + 0.1) )
    * ```
    *
    * @param amount Amount of resources to be sent.
    * @param roomName1 The name of the first room.
    * @param roomName2 The name of the second room.
    * @returns The amount of energy required to perform the transaction.
    */
  def calcTransactionCost(amount: Double, roomName1: String, roomName2: String): Double = js.native
  /**
    * Cancel a previously created order. The 5% fee is not returned.
    * @param orderId The order ID as provided in Game.market.orders
    * @returns Result Code: OK, ERR_INVALID_ARGS
    */
  def cancelOrder(orderId: String): ScreepsReturnCode = js.native
  /**
    * Change the price of an existing order. If `newPrice` is greater than old price, you will be charged `(newPrice-oldPrice)*remainingAmount*0.05` credits.
    * @param orderId The order ID as provided in Game.market.orders
    * @param newPrice The new order price.
    * @returns Result Code: OK, ERR_NOT_OWNER, ERR_NOT_ENOUGH_RESOURCES, ERR_INVALID_ARGS
    */
  def changeOrderPrice(orderId: String, newPrice: Double): ScreepsReturnCode = js.native
  /**
    * Create a market order in your terminal. You will be charged `price*amount*0.05` credits when the order is placed.
    *
    * The maximum orders count is 50 per player. You can create an order at any time with any amount,
    * it will be automatically activated and deactivated depending on the resource/credits availability.
    */
  def createOrder(`type`: String, resourceType: MarketResourceConstant, price: Double, totalAmount: Double): ScreepsReturnCode = js.native
  def createOrder(
    `type`: String,
    resourceType: MarketResourceConstant,
    price: Double,
    totalAmount: Double,
    roomName: String
  ): ScreepsReturnCode = js.native
  /**
    * Execute a trade deal from your Terminal to another player's Terminal using the specified buy/sell order.
    *
    * Your Terminal will be charged energy units of transfer cost regardless of the order resource type.
    * You can use Game.market.calcTransactionCost method to estimate it.
    *
    * When multiple players try to execute the same deal, the one with the shortest distance takes precedence.
    */
  def deal(orderId: String, amount: Double): ScreepsReturnCode = js.native
  def deal(orderId: String, amount: Double, targetRoomName: String): ScreepsReturnCode = js.native
  /**
    * Add more capacity to an existing order. It will affect `remainingAmount` and `totalAmount` properties. You will be charged `price*addAmount*0.05` credits.
    * @param orderId The order ID as provided in Game.market.orders
    * @param addAmount How much capacity to add. Cannot be a negative value.
    * @returns One of the following codes: `OK`, `ERR_NOT_ENOUGH_RESOURCES`, `ERR_INVALID_ARGS`
    */
  def extendOrder(orderId: String, addAmount: Double): ScreepsReturnCode = js.native
  /**
    * Get other players' orders currently active on the market.
    * @param filter (optional) An object or function that will filter the resulting list using the lodash.filter method.
    * @returns An array of objects containing order information.
    */
  def getAllOrders(): js.Array[Order] = js.native
  def getAllOrders(filter: js.Function1[/* o */ Order, Boolean]): js.Array[Order] = js.native
  def getAllOrders(filter: OrderFilter): js.Array[Order] = js.native
  /**
    * Retrieve info for specific market order.
    * @param orderId The order ID.
    * @returns An object with the order info. See `getAllOrders` for properties explanation.
    */
  def getOrderById(id: String): Order | Null = js.native
}

