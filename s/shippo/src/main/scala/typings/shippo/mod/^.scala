package typings.shippo.mod

import org.scalablytyped.runtime.TopLevel
import typings.shippo.anon.Create
import typings.shippo.anon.CreateList
import typings.shippo.anon.ListRetrieve
import typings.shippo.anon.Retrieve
import typings.shippo.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("shippo", JSImport.Namespace)
@js.native
open class ^ protected ()
  extends StObject
     with typings.shippo.mod.Shippo.Shippo {
  def this(token: String) = this()
  
  /* CompleteClass */
  var address: typings.shippo.anon.List = js.native
  
  /* CompleteClass */
  var carrieraccount: ListRetrieve = js.native
  
  /* CompleteClass */
  var parcel: CreateList = js.native
  
  /* CompleteClass */
  var rate: `0` = js.native
  
  /* CompleteClass */
  var shipment: Create = js.native
  
  /* CompleteClass */
  var transaction: Retrieve = js.native
}
@JSImport("shippo", JSImport.Namespace)
@js.native
object ^
  extends StObject
     with TopLevel[ShippoStatic]
