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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayModernSelectorMod {
  
  @JSImport("relay-runtime/lib/store/RelayModernSelector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def areEqualSelectors(thisSelector: SingularReaderSelector, thatSelector: SingularReaderSelector): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areEqualSelectors")(thisSelector.asInstanceOf[js.Any], thatSelector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def createNormalizationSelector(node: NormalizationSelectableNode, dataID: DataID, variables: Variables): NormalizationSelector = (^.asInstanceOf[js.Dynamic].applyDynamic("createNormalizationSelector")(node.asInstanceOf[js.Any], dataID.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[NormalizationSelector]
  
  inline def createReaderSelector(fragment: ReaderFragment, dataID: DataID, variables: Variables, request: RequestDescriptor): SingularReaderSelector = (^.asInstanceOf[js.Dynamic].applyDynamic("createReaderSelector")(fragment.asInstanceOf[js.Any], dataID.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[SingularReaderSelector]
  inline def createReaderSelector(
    fragment: ReaderFragment,
    dataID: DataID,
    variables: Variables,
    request: RequestDescriptor,
    isWithinUnmatchedTypeRefinement: Boolean
  ): SingularReaderSelector = (^.asInstanceOf[js.Dynamic].applyDynamic("createReaderSelector")(fragment.asInstanceOf[js.Any], dataID.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], request.asInstanceOf[js.Any], isWithinUnmatchedTypeRefinement.asInstanceOf[js.Any])).asInstanceOf[SingularReaderSelector]
  
  inline def getDataIDsFromFragment(fragment: ReaderFragment, item: js.Any): DataID | js.Array[DataID] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDataIDsFromFragment")(fragment.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[DataID | js.Array[DataID]]
  inline def getDataIDsFromFragment(fragment: ReaderFragment, item: js.Array[js.Any]): DataID | js.Array[DataID] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDataIDsFromFragment")(fragment.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[DataID | js.Array[DataID]]
  
  inline def getDataIDsFromObject(fragments: StringDictionary[ReaderFragment], `object`: StringDictionary[js.Any]): StringDictionary[DataID | js.Array[DataID]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDataIDsFromObject")(fragments.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[DataID | js.Array[DataID]]]
  
  inline def getPluralSelector(fragment: ReaderFragment, items: js.Array[js.Any]): PluralReaderSelector = (^.asInstanceOf[js.Dynamic].applyDynamic("getPluralSelector")(fragment.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[PluralReaderSelector]
  
  inline def getSelector(fragment: ReaderFragment, item: js.Any): ReaderSelector = (^.asInstanceOf[js.Dynamic].applyDynamic("getSelector")(fragment.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[ReaderSelector]
  inline def getSelector(fragment: ReaderFragment, item: js.Array[js.Any]): ReaderSelector = (^.asInstanceOf[js.Dynamic].applyDynamic("getSelector")(fragment.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[ReaderSelector]
  
  inline def getSelectorsFromObject(fragments: StringDictionary[ReaderFragment], `object`: StringDictionary[js.Any]): StringDictionary[ReaderSelector] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSelectorsFromObject")(fragments.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[ReaderSelector]]
  
  inline def getSingularSelector(fragment: ReaderFragment, item: js.Any): SingularReaderSelector = (^.asInstanceOf[js.Dynamic].applyDynamic("getSingularSelector")(fragment.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[SingularReaderSelector]
  
  inline def getVariablesFromFragment(fragment: ReaderFragment, item: js.Any): Variables = (^.asInstanceOf[js.Dynamic].applyDynamic("getVariablesFromFragment")(fragment.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Variables]
  inline def getVariablesFromFragment(fragment: ReaderFragment, item: js.Array[js.Any]): Variables = (^.asInstanceOf[js.Dynamic].applyDynamic("getVariablesFromFragment")(fragment.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Variables]
  
  inline def getVariablesFromObject(fragments: StringDictionary[ReaderFragment], `object`: StringDictionary[js.Any]): Variables = (^.asInstanceOf[js.Dynamic].applyDynamic("getVariablesFromObject")(fragments.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Variables]
  
  inline def getVariablesFromPluralFragment(fragment: ReaderFragment, items: js.Array[js.Any]): Variables = (^.asInstanceOf[js.Dynamic].applyDynamic("getVariablesFromPluralFragment")(fragment.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[Variables]
  
  inline def getVariablesFromSingularFragment(fragment: ReaderFragment, item: js.Any): Variables = (^.asInstanceOf[js.Dynamic].applyDynamic("getVariablesFromSingularFragment")(fragment.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Variables]
}
