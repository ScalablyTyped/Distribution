package typings.relayDashRuntime

import org.scalablytyped.runtime.StringDictionary
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.NormalizationSelector
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.PluralReaderSelector
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.ReaderSelector
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.RequestDescriptor
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.SingularReaderSelector
import typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationSelectableNode
import typings.relayDashRuntime.libUtilReaderNodeMod.ReaderFragment
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/store/RelayModernSelector", JSImport.Namespace)
@js.native
object libStoreRelayModernSelectorMod extends js.Object {
  def areEqualSelectors(thisSelector: SingularReaderSelector, thatSelector: SingularReaderSelector): Boolean = js.native
  def createNormalizationSelector(node: NormalizationSelectableNode, dataID: DataID, variables: Variables): NormalizationSelector = js.native
  def createReaderSelector(fragment: ReaderFragment, dataID: DataID, variables: Variables, request: RequestDescriptor): SingularReaderSelector = js.native
  def getDataIDsFromFragment(fragment: ReaderFragment, item: js.Any): DataID | js.Array[DataID] = js.native
  def getDataIDsFromFragment(fragment: ReaderFragment, item: js.Array[_]): DataID | js.Array[DataID] = js.native
  def getDataIDsFromObject(fragments: StringDictionary[ReaderFragment], `object`: StringDictionary[js.Any]): StringDictionary[DataID | js.Array[DataID]] = js.native
  def getPluralSelector(fragment: ReaderFragment, items: js.Array[_]): PluralReaderSelector = js.native
  def getSelector(fragment: ReaderFragment, item: js.Any): ReaderSelector = js.native
  def getSelector(fragment: ReaderFragment, item: js.Array[_]): ReaderSelector = js.native
  def getSelectorsFromObject(fragments: StringDictionary[ReaderFragment], `object`: StringDictionary[js.Any]): StringDictionary[ReaderSelector] = js.native
  def getSingularSelector(fragment: ReaderFragment, item: js.Any): SingularReaderSelector = js.native
  def getVariablesFromFragment(fragment: ReaderFragment, item: js.Any): Variables = js.native
  def getVariablesFromFragment(fragment: ReaderFragment, item: js.Array[_]): Variables = js.native
  def getVariablesFromObject(fragments: StringDictionary[ReaderFragment], `object`: StringDictionary[js.Any]): Variables = js.native
  def getVariablesFromPluralFragment(fragment: ReaderFragment, items: js.Array[_]): Variables = js.native
  def getVariablesFromSingularFragment(fragment: ReaderFragment, item: js.Any): Variables = js.native
}

