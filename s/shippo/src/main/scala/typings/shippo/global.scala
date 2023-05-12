package typings.shippo

import org.scalablytyped.runtime.Shortcut
import typings.shippo.anon.Add
import typings.shippo.anon.Create
import typings.shippo.anon.CreateList
import typings.shippo.anon.CreateListRetrieve
import typings.shippo.anon.Getstatus
import typings.shippo.anon.ListRetrieve
import typings.shippo.anon.Retrieve
import typings.shippo.anon.`0`
import typings.shippo.anon.`1`
import typings.shippo.anon.`2`
import typings.shippo.anon.`3`
import typings.shippo.mod.ShippoStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Shippo extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Shippo")
    @js.native
    open class ^ protected ()
      extends StObject
         with typings.shippo.mod.Shippo {
      def this(token: String) = this()
      
      /* CompleteClass */
      var address: Create = js.native
      
      /* CompleteClass */
      var batch: Add = js.native
      
      /* CompleteClass */
      var carrieraccount: `0` = js.native
      
      /* CompleteClass */
      var customsdeclaration: CreateListRetrieve = js.native
      
      /* CompleteClass */
      var customsitem: ListRetrieve = js.native
      
      /* CompleteClass */
      var manifest: `1` = js.native
      
      /* CompleteClass */
      var parcel: typings.shippo.anon.List = js.native
      
      /* CompleteClass */
      var rate: `3` = js.native
      
      /* CompleteClass */
      var refund: `2` = js.native
      
      /* CompleteClass */
      var shipment: Retrieve = js.native
      
      /* CompleteClass */
      var track: Getstatus = js.native
      
      /* CompleteClass */
      var transaction: CreateList = js.native
    }
    
    @JSGlobal("Shippo")
    @js.native
    val ^ : ShippoStatic = js.native
    
    type _To = ShippoStatic
    
    /* This means you don't have to write `^`, but can instead just say `Shippo.foo` */
    override def _to: ShippoStatic = ^
  }
}
