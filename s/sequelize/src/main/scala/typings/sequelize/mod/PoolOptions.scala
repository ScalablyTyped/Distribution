package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Connection Pool options
  *
  * @see Options
  */
@js.native
trait PoolOptions extends StObject {
  
  /**
    * The maximum time, in milliseconds, that pool will try to get connection before throwing error
    */
  var acquire: js.UndefOr[Double] = js.native
  
  /*
    * The time interval, in milliseconds, for evicting stale connections
    */
  var evict: js.UndefOr[Double] = js.native
  
  /**
    * The maximum time, in milliseconds, that a connection can be idle before being released.
    */
  var idle: js.UndefOr[Double] = js.native
  
  /**
    * Maximum connections of the pool
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * Minimum connections of the pool
    */
  var min: js.UndefOr[Double] = js.native
  
  /**
    * A function that validates a connection. Called with client. The default function checks that client is an
    * object, and that its state is not disconnected.
    */
  var validate: js.UndefOr[js.Function1[/* client */ js.UndefOr[js.Any], Boolean]] = js.native
}
object PoolOptions {
  
  @scala.inline
  def apply(): PoolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoolOptions]
  }
  
  @scala.inline
  implicit class PoolOptionsMutableBuilder[Self <: PoolOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcquire(value: Double): Self = StObject.set(x, "acquire", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcquireUndefined: Self = StObject.set(x, "acquire", js.undefined)
    
    @scala.inline
    def setEvict(value: Double): Self = StObject.set(x, "evict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvictUndefined: Self = StObject.set(x, "evict", js.undefined)
    
    @scala.inline
    def setIdle(value: Double): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleUndefined: Self = StObject.set(x, "idle", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setValidate(value: /* client */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
