package typings
package soapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object soapMod {
  type IService = org.scalablytyped.runtime.StringDictionary[IServicePort]
  type IServicePort = org.scalablytyped.runtime.StringDictionary[ISoapServiceMethod]
  type IServices = org.scalablytyped.runtime.StringDictionary[IService]
  type ISoapMethod = js.Function4[
    /* args */ js.Any, 
    /* callback */ js.Function4[
      /* err */ js.Any, 
      /* result */ js.Any, 
      /* raw */ js.Any, 
      /* soapHeader */ js.Any, 
      scala.Unit
    ], 
    /* options */ js.UndefOr[js.Any], 
    /* extraHeaders */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type ISoapServiceMethod = js.Function4[
    /* args */ js.Any, 
    /* callback */ js.UndefOr[js.Function1[/* data */ js.Any, scala.Unit]], 
    /* headers */ js.UndefOr[js.Any], 
    /* req */ js.UndefOr[js.Any], 
    js.Any
  ]
  type Option = IOptions
  type Security = ISecurity
  type SoapMethod = ISoapMethod
  type WsdlBindings = org.scalablytyped.runtime.StringDictionary[WsdlBinding]
  type WsdlElements = org.scalablytyped.runtime.StringDictionary[XsdElement]
  type WsdlMessages = org.scalablytyped.runtime.StringDictionary[WsdlMessage]
  type WsdlPortTypes = org.scalablytyped.runtime.StringDictionary[WsdlPortType]
  type WsdlSchemas = org.scalablytyped.runtime.StringDictionary[WsdlSchema]
  type WsdlServices = org.scalablytyped.runtime.StringDictionary[WsdlService]
}
