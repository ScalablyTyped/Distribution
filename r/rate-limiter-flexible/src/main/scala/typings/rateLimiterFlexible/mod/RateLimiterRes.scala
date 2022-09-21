package typings.rateLimiterFlexible.mod

import typings.rateLimiterFlexible.anon.ConsumedPoints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rate-limiter-flexible", "RateLimiterRes")
@js.native
open class RateLimiterRes () extends StObject {
  def this(remainingPoints: Double) = this()
  def this(remainingPoints: Double, msBeforeNext: Double) = this()
  def this(remainingPoints: Unit, msBeforeNext: Double) = this()
  def this(remainingPoints: Double, msBeforeNext: Double, consumedPoints: Double) = this()
  def this(remainingPoints: Double, msBeforeNext: Unit, consumedPoints: Double) = this()
  def this(remainingPoints: Unit, msBeforeNext: Double, consumedPoints: Double) = this()
  def this(remainingPoints: Unit, msBeforeNext: Unit, consumedPoints: Double) = this()
  def this(remainingPoints: Double, msBeforeNext: Double, consumedPoints: Double, isFirstInDuration: Boolean) = this()
  def this(remainingPoints: Double, msBeforeNext: Double, consumedPoints: Unit, isFirstInDuration: Boolean) = this()
  def this(remainingPoints: Double, msBeforeNext: Unit, consumedPoints: Double, isFirstInDuration: Boolean) = this()
  def this(remainingPoints: Double, msBeforeNext: Unit, consumedPoints: Unit, isFirstInDuration: Boolean) = this()
  def this(remainingPoints: Unit, msBeforeNext: Double, consumedPoints: Double, isFirstInDuration: Boolean) = this()
  def this(remainingPoints: Unit, msBeforeNext: Double, consumedPoints: Unit, isFirstInDuration: Boolean) = this()
  def this(remainingPoints: Unit, msBeforeNext: Unit, consumedPoints: Double, isFirstInDuration: Boolean) = this()
  def this(remainingPoints: Unit, msBeforeNext: Unit, consumedPoints: Unit, isFirstInDuration: Boolean) = this()
  
  val consumedPoints: Double = js.native
  
  val isFirstInDuration: Boolean = js.native
  
  val msBeforeNext: Double = js.native
  
  val remainingPoints: Double = js.native
  
  def toJSON(): ConsumedPoints = js.native
}
