package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identifier {
  
  @js.native
  trait ISequential extends ISimple {
    
    /** [Method] Returns the value of seed
      * @returns Number
      */
    var getSeed: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Config Option] (String) */
    var prefix: js.UndefOr[String] = js.native
    
    /** [Config Option] (Number) */
    var seed: js.UndefOr[Double] = js.native
    
    /** [Method] Sets the value of seed
      * @param seed Number The new value.
      */
    var setSeed: js.UndefOr[js.Function1[/* seed */ js.UndefOr[Double], Unit]] = js.native
  }
  object ISequential {
    
    @scala.inline
    def apply(): ISequential = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISequential]
    }
    
    @scala.inline
    implicit class ISequentialMutableBuilder[Self <: ISequential] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetSeed(value: () => Double): Self = StObject.set(x, "getSeed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSeedUndefined: Self = StObject.set(x, "getSeed", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      @scala.inline
      def setSetSeed(value: /* seed */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setSeed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSeedUndefined: Self = StObject.set(x, "setSeed", js.undefined)
    }
  }
  
  @js.native
  trait ISimple extends IBase {
    
    /** [Method] Returns the value of prefix
      * @returns String
      */
    var getPrefix: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Method] Sets the value of prefix
      * @param prefix String The new value.
      */
    var setPrefix: js.UndefOr[js.Function1[/* prefix */ js.UndefOr[String], Unit]] = js.native
  }
  object ISimple {
    
    @scala.inline
    def apply(): ISimple = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISimple]
    }
    
    @scala.inline
    implicit class ISimpleMutableBuilder[Self <: ISimple] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetPrefix(value: () => String): Self = StObject.set(x, "getPrefix", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPrefixUndefined: Self = StObject.set(x, "getPrefix", js.undefined)
      
      @scala.inline
      def setSetPrefix(value: /* prefix */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setPrefix", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPrefixUndefined: Self = StObject.set(x, "setPrefix", js.undefined)
    }
  }
  
  @js.native
  trait IUuid extends ISimple {
    
    /** [Method] Returns the value of id
      * @returns Object
      */
    var getId: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of version
      * @returns Number
      */
    var getVersion: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Config Option] (Object) */
    var id: js.UndefOr[js.Any] = js.native
    
    /** [Method] Reconfigures this generator given new config properties
      * @param config Object
      */
    var reconfigure: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Property] (Number/Object) */
    var salt: js.UndefOr[js.Any] = js.native
    
    /** [Method] Sets the value of id
      * @param id Object The new value.
      */
    var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of version
      * @param version Number The new value.
      */
    var setVersion: js.UndefOr[js.Function1[/* version */ js.UndefOr[Double], Unit]] = js.native
    
    /** [Property] (Number/Object) */
    var timestamp: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Number) */
    var version: js.UndefOr[Double] = js.native
  }
  object IUuid {
    
    @scala.inline
    def apply(): IUuid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IUuid]
    }
    
    @scala.inline
    implicit class IUuidMutableBuilder[Self <: IUuid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetId(value: () => _): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIdUndefined: Self = StObject.set(x, "getId", js.undefined)
      
      @scala.inline
      def setGetVersion(value: () => Double): Self = StObject.set(x, "getVersion", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetVersionUndefined: Self = StObject.set(x, "getVersion", js.undefined)
      
      @scala.inline
      def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setReconfigure(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "reconfigure", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReconfigureUndefined: Self = StObject.set(x, "reconfigure", js.undefined)
      
      @scala.inline
      def setSalt(value: js.Any): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
      
      @scala.inline
      def setSetId(value: /* id */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetIdUndefined: Self = StObject.set(x, "setId", js.undefined)
      
      @scala.inline
      def setSetVersion(value: /* version */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setVersion", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetVersionUndefined: Self = StObject.set(x, "setVersion", js.undefined)
      
      @scala.inline
      def setTimestamp(value: js.Any): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
