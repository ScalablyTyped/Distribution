package typings.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.normalizationNodeMod.NormalizationSelectableNode
import typings.relayRuntime.readerNodeMod.ReaderFragment
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.relayRuntime.relayStoreTypesMod.NormalizationSelector
import typings.relayRuntime.relayStoreTypesMod.PluralReaderSelector
import typings.relayRuntime.relayStoreTypesMod.ReaderSelector
import typings.relayRuntime.relayStoreTypesMod.RequestDescriptor
import typings.relayRuntime.relayStoreTypesMod.SingularReaderSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayModernSelectorMod {
  
  @JSImport("relay-runtime/lib/store/RelayModernSelector", "areEqualSelectors")
  @js.native
  def areEqualSelectors(thisSelector: SingularReaderSelector, thatSelector: SingularReaderSelector): Boolean = js.native
  
  @JSImport("relay-runtime/lib/store/RelayModernSelector", "createNormalizationSelector")
  @js.native
  def createNormalizationSelector(node: NormalizationSelectableNode, dataID: DataID, variables: Variables): NormalizationSelector = js.native
  
  @JSImport("relay-runtime/lib/store/RelayModernSelector", "createReaderSelector")
  @js.native
  def createReaderSelector(fragment: ReaderFragment, dataID: DataID, variables: Variables, request: RequestDescriptor): SingularReaderSelector = js.native
  @JSImport("relay-runtime/lib/store/RelayModernSelector", "createReaderSelector")
  @js.native
  def createReaderSelector(
    fragment: ReaderFragment,
    dataID: DataID,
    variables: Variables,
    request: RequestDescriptor,
    isWithinUnmatchedTypeRefinement: Boolean
  ): SingularReaderSelector = js.native
  
  @JSImport("relay-runtime/lib/store/RelayModernSelector", "getDataIDsFromFragment")
  @js.native
  def getDataIDsFromFragment(fragment: ReaderFragment, item: js.Any): DataID | js.Array[DataID] = js.native
  @JSImport("relay-runtime/lib/store/RelayModernSelector", "getDataIDsFromFragment")
  @js.native
  def getDataIDsFromFragment(fragment: ReaderFragment, item: js.Array[_]): DataID | js.Array[DataID] = js.native
  
  @JSImport("relay-runtime/lib/store/RelayModernSelector", "getDataIDsFromObject")
  @js.native
  def getDataIDsFromObject(fragments: StringDictionary[ReaderFragment], `object`: StringDictionary[js.Any]): StringDictionary[DataID | js.Array[DataID]] = js.native
  
  @JSImport("relay-runtime/lib/store/RelayModernSelector", "getPluralSelector")
  @js.native
  def getPluralSelector(fragment: ReaderFragment, items: js.Array[_]): PluralReaderSelector = js.native
  
  @JSImport("relay-runtime/lib/store/RelayModernSelector", "getSelector")
  @js.native
  def getSelector(fragment: ReaderFragment, item: js.Any): ReaderSelector = js.native
  @JSImport("relay-runtime/lib/store/RelayModernSelector", "getSelector")
  @js.native
  def getSelector(fragment: ReaderFragment, item: js.Array[_]): ReaderSelector = js.native
  
  @JSImport("relay-runtime/lib/store/RelayModernSelector", "getSelectorsFromObject")
  @js.native
  def getSelectorsFromObject(fragments: StringDictionary[ReaderFragment], `object`: StringDictionary[js.Any]): StringDictionary[ReaderSelector] = js.native
  
  @JSImport("relay-runtime/lib/store/RelayModernSelector", "getSingularSelector")
  @js.native
  def getSingularSelector(fragment: ReaderFragment, item: js.Any): SingularReaderSelector = js.native
  
  @JSImport("relay-runtime/lib/store/RelayModernSelector", "getVariablesFromFragment")
  @js.native
  def getVariablesFromFragment(fragment: ReaderFragment, item: js.Any): Variables = js.native
  @JSImport("relay-runtime/lib/store/RelayModernSelector", "getVariablesFromFragment")
  @js.native
  def getVariablesFromFragment(fragment: ReaderFragment, item: js.Array[_]): Variables = js.native
  
  @JSImport("relay-runtime/lib/store/RelayModernSelector", "getVariablesFromObject")
  @js.native
  def getVariablesFromObject(fragments: StringDictionary[ReaderFragment], `object`: StringDictionary[js.Any]): Variables = js.native
  
  @JSImport("relay-runtime/lib/store/RelayModernSelector", "getVariablesFromPluralFragment")
  @js.native
  def getVariablesFromPluralFragment(fragment: ReaderFragment, items: js.Array[_]): Variables = js.native
  
  @JSImport("relay-runtime/lib/store/RelayModernSelector", "getVariablesFromSingularFragment")
  @js.native
  def getVariablesFromSingularFragment(fragment: ReaderFragment, item: js.Any): Variables = js.native
}
