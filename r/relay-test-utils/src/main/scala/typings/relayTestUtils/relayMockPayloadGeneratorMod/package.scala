package typings.relayTestUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object relayMockPayloadGeneratorMod {
  
  type MockResolver = js.Function2[
    /* context */ typings.relayTestUtils.relayMockPayloadGeneratorMod.MockResolverContext, 
    /* generateId */ js.Function0[scala.Double], 
    js.Any
  ]
  
  type MockResolvers = org.scalablytyped.runtime.StringDictionary[typings.relayTestUtils.relayMockPayloadGeneratorMod.MockResolver]
}
