package typings.stellarSdk.mod

import typings.stellarBase.mod.MemoType
import typings.stellarSdk.anon.ClientAccountID
import typings.stellarSdk.serverApiMod.ServerApi.AccountRecordSigners
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Utils {
  
  @JSImport("stellar-sdk", "Utils.buildChallengeTx")
  @js.native
  def buildChallengeTx(
    serverKeypair: typings.stellarBase.mod.Keypair,
    clientAccountID: String,
    homeDomain: String,
    timeout: js.UndefOr[scala.Nothing],
    networkPassphrase: String
  ): String = js.native
  @JSImport("stellar-sdk", "Utils.buildChallengeTx")
  @js.native
  def buildChallengeTx(
    serverKeypair: typings.stellarBase.mod.Keypair,
    clientAccountID: String,
    homeDomain: String,
    timeout: Double,
    networkPassphrase: String
  ): String = js.native
  
  @JSImport("stellar-sdk", "Utils.gatherTxSigners")
  @js.native
  def gatherTxSigners(transaction: typings.stellarBase.mod.FeeBumpTransaction, signers: js.Array[String]): js.Array[String] = js.native
  @JSImport("stellar-sdk", "Utils.gatherTxSigners")
  @js.native
  def gatherTxSigners(
    transaction: typings.stellarBase.mod.Transaction[
      typings.stellarBase.mod.Memo[MemoType], 
      js.Array[typings.stellarBase.mod.Operation]
    ],
    signers: js.Array[String]
  ): js.Array[String] = js.native
  
  @JSImport("stellar-sdk", "Utils.readChallengeTx")
  @js.native
  def readChallengeTx(challengeTx: String, serverAccountID: String, networkPassphrase: String, homeDomains: String): ClientAccountID = js.native
  @JSImport("stellar-sdk", "Utils.readChallengeTx")
  @js.native
  def readChallengeTx(
    challengeTx: String,
    serverAccountID: String,
    networkPassphrase: String,
    homeDomains: js.Array[String]
  ): ClientAccountID = js.native
  
  @JSImport("stellar-sdk", "Utils.verifyChallengeTxSigners")
  @js.native
  def verifyChallengeTxSigners(
    challengeTx: String,
    serverAccountID: String,
    networkPassphrase: String,
    signers: js.Array[String],
    homeDomains: String
  ): js.Array[String] = js.native
  @JSImport("stellar-sdk", "Utils.verifyChallengeTxSigners")
  @js.native
  def verifyChallengeTxSigners(
    challengeTx: String,
    serverAccountID: String,
    networkPassphrase: String,
    signers: js.Array[String],
    homeDomains: js.Array[String]
  ): js.Array[String] = js.native
  
  @JSImport("stellar-sdk", "Utils.verifyChallengeTxThreshold")
  @js.native
  def verifyChallengeTxThreshold(
    challengeTx: String,
    serverAccountID: String,
    networkPassphrase: String,
    threshold: Double,
    signerSummary: js.Array[AccountRecordSigners],
    homeDomains: String
  ): js.Array[String] = js.native
  @JSImport("stellar-sdk", "Utils.verifyChallengeTxThreshold")
  @js.native
  def verifyChallengeTxThreshold(
    challengeTx: String,
    serverAccountID: String,
    networkPassphrase: String,
    threshold: Double,
    signerSummary: js.Array[AccountRecordSigners],
    homeDomains: js.Array[String]
  ): js.Array[String] = js.native
  
  @JSImport("stellar-sdk", "Utils.verifyTxSignedBy")
  @js.native
  def verifyTxSignedBy(transaction: typings.stellarBase.mod.FeeBumpTransaction, accountID: String): Boolean = js.native
  @JSImport("stellar-sdk", "Utils.verifyTxSignedBy")
  @js.native
  def verifyTxSignedBy(
    transaction: typings.stellarBase.mod.Transaction[
      typings.stellarBase.mod.Memo[MemoType], 
      js.Array[typings.stellarBase.mod.Operation]
    ],
    accountID: String
  ): Boolean = js.native
}
