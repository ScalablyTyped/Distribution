package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "StellarBase")
@js.native
object StellarBaseNs extends js.Object {
  @js.native
  sealed trait ASSET_TYPE extends js.Object
  
  @js.native
  class Account protected () extends js.Object {
    def this(accountId: java.lang.String, sequence: java.lang.String) = this()
    def this(accountId: java.lang.String, sequence: scala.Double) = this()
    def accountId(): java.lang.String = js.native
    def incrementSequenceNumber(): scala.Unit = js.native
    def sequenceNumber(): java.lang.String = js.native
  }
  
  @js.native
  class Asset protected () extends js.Object {
    def this(code: java.lang.String, issuer: java.lang.String) = this()
    var code: java.lang.String = js.native
    var issuer: java.lang.String = js.native
    def equals(other: Asset): scala.Boolean = js.native
    def getAssetType(): ASSET_TYPE = js.native
    def getCode(): java.lang.String = js.native
    def getIssuer(): java.lang.String = js.native
    def isNative(): scala.Boolean = js.native
    def toXDRObject(): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Asset = js.native
  }
  
  @js.native
  class Keypair protected () extends js.Object {
    def this(keys: stellarDashSdkLib.Anon_Type) = this()
    def this(keys: stellarDashSdkLib.Anon_TypeEd25519) = this()
    def canSign(): scala.Boolean = js.native
    def publicKey(): java.lang.String = js.native
    def rawPublicKey(): nodeLib.Buffer = js.native
    def rawSecretKey(): nodeLib.Buffer = js.native
    def secret(): java.lang.String = js.native
    def sign(data: nodeLib.Buffer): nodeLib.Buffer = js.native
    def signDecorated(data: nodeLib.Buffer): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.DecoratedSignature = js.native
    def signatureHint(): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.SignatureHint = js.native
    def verify(data: nodeLib.Buffer, signature: nodeLib.Buffer): scala.Boolean = js.native
  }
  
  @js.native
  class Memo[T /* <: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoNs.AnyType */] protected () extends js.Object {
    def this(`type`: MemoNone) = this()
    def this(`type`: T, value: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoNs.AnyValue) = this()
    def this(`type`: MemoHash, value: java.lang.String) = this()
    def this(`type`: MemoHash, value: nodeLib.Buffer) = this()
    def this(`type`: MemoID, value: java.lang.String) = this()
    def this(`type`: MemoReturn, value: java.lang.String) = this()
    def this(`type`: MemoReturn, value: nodeLib.Buffer) = this()
    def this(`type`: MemoText, value: java.lang.String) = this()
    var `type`: T = js.native
    var value: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoNs.AnyValue | nodeLib.Buffer | java.lang.String | scala.Null = js.native
    def toXDRObject(): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Memo = js.native
  }
  
  @js.native
  class Network protected () extends js.Object {
    def this(passphrase: java.lang.String) = this()
    def networkId(): java.lang.String = js.native
    def networkPassphrase(): java.lang.String = js.native
  }
  
  @js.native
  sealed trait Networks extends js.Object
  
  @js.native
  sealed trait OperationType extends js.Object
  
  @js.native
  class Transaction protected () extends js.Object {
    def this(envelope: java.lang.String) = this()
    def this(envelope: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.TransactionEnvelope) = this()
    var fee: scala.Double = js.native
    var memo: Memo[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoNs.AnyType] = js.native
    var operations: js.Array[TransactionOperation] = js.native
    var sequence: scala.Double = js.native
    var signatures: js.Array[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.DecoratedSignature] = js.native
    var source: java.lang.String = js.native
    def hash(): nodeLib.Buffer = js.native
    def sign(keypairs: Keypair*): scala.Unit = js.native
    def signHashX(preimage: java.lang.String): scala.Unit = js.native
    def signHashX(preimage: nodeLib.Buffer): scala.Unit = js.native
    def signatureBase(): nodeLib.Buffer = js.native
    def toEnvelope(): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.TransactionEnvelope = js.native
  }
  
  @js.native
  class TransactionBuilder protected () extends js.Object {
    def this(sourceAccount: Account) = this()
    def this(sourceAccount: Account, options: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.TransactionBuilderNs.TransactionBuilderOptions) = this()
    def addMemo(memo: Memo[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoNs.AnyType]): this.type = js.native
    def addOperation(
      operation: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Operation[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.Operation]
    ): this.type = js.native
    def build(): Transaction = js.native
  }
  
  val AuthImmutableFlag: stellarDashSdkLib.stellarDashSdkLibNumbers.`4` = js.native
  val AuthRequiredFlag: stellarDashSdkLib.stellarDashSdkLibNumbers.`1` = js.native
  val AuthRevocableFlag: stellarDashSdkLib.stellarDashSdkLibNumbers.`2` = js.native
  val FastSigning: scala.Boolean = js.native
  val MemoHash: /* hash */ java.lang.String = js.native
  val MemoID: /* id */ java.lang.String = js.native
  val MemoNone: /* none */ java.lang.String = js.native
  val MemoReturn: /* return */ java.lang.String = js.native
  val MemoText: /* text */ java.lang.String = js.native
  def hash(data: nodeLib.Buffer): nodeLib.Buffer = js.native
  def sign(data: nodeLib.Buffer, rawSecret: nodeLib.Buffer): nodeLib.Buffer = js.native
  def verify(data: nodeLib.Buffer, signature: nodeLib.Buffer, rawPublicKey: nodeLib.Buffer): scala.Boolean = js.native
  @js.native
  object ASSET_TYPE extends js.Object {
    @js.native
    sealed trait credit12
      extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.ASSET_TYPE
    
    @js.native
    sealed trait credit4
      extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.ASSET_TYPE
    
    @js.native
    sealed trait native
      extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.ASSET_TYPE
    
    /* "credit_alphanum12" */ val credit12: credit12 with java.lang.String = js.native
    /* "credit_alphanum4" */ val credit4: credit4 with java.lang.String = js.native
    /* "native" */ val native: native with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.ASSET_TYPE with java.lang.String
      ] = js.native
  }
  
  @js.native
  object Asset extends js.Object {
    def fromOperation(xdr: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Asset): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Asset = js.native
    def native(): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Asset = js.native
  }
  
  @js.native
  object Keypair extends js.Object {
    def fromBase58Seed(secretSeed: java.lang.String): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Keypair = js.native
    def fromPublicKey(publicKey: java.lang.String): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Keypair = js.native
    def fromRawEd25519Seed(secretSeed: nodeLib.Buffer): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Keypair = js.native
    def fromSecret(secretKey: java.lang.String): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Keypair = js.native
    def master(): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Keypair = js.native
    def random(): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Keypair = js.native
  }
  
  @js.native
  object Memo extends js.Object {
    def fromXDRObject(memo: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Memo): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Memo[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoNs.AnyType] = js.native
    def hash(hash: java.lang.String): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Memo[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoHash] = js.native
    def id(id: java.lang.String): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Memo[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoID] = js.native
    def none(): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Memo[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoNone] = js.native
    def `return`(hash: java.lang.String): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Memo[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoReturn] = js.native
    def text(text: java.lang.String): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Memo[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoText] = js.native
  }
  
  @JSName("Memo")
  @js.native
  object MemoNs extends js.Object {
    type AnyType = stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoNone | stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoID | stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoText | stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoHash | stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoReturn
    type AnyValue = scala.Null | java.lang.String | nodeLib.Buffer
  }
  
  @js.native
  object Network extends js.Object {
    def current(): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Network = js.native
    def use(network: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Network): scala.Unit = js.native
    def usePublicNetwork(): scala.Unit = js.native
    def useTestNetwork(): scala.Unit = js.native
  }
  
  @js.native
  object Networks extends js.Object {
    @js.native
    sealed trait PUBLIC
      extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Networks
    
    @js.native
    sealed trait TESTNET
      extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Networks
    
    /* "Public Global Stellar Network ; September 2015" */ val PUBLIC: PUBLIC with java.lang.String = js.native
    /* "Test SDF Network ; September 2015" */ val TESTNET: TESTNET with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Networks with java.lang.String] = js.native
  }
  
  @JSName("Operation")
  @js.native
  object OperationNs extends js.Object {
    trait AccountMerge extends Operation {
      var destination: java.lang.String
    }
    
    trait AccountMergeOptions extends js.Object {
      var destination: java.lang.String
      var source: js.UndefOr[java.lang.String] = js.undefined
    }
    
    trait AllowTrust extends Operation {
      var assetCode: java.lang.String
      var authorize: scala.Boolean
      var trustor: java.lang.String
    }
    
    trait AllowTrustOptions extends js.Object {
      var assetCode: java.lang.String
      var authorize: scala.Boolean
      var source: js.UndefOr[java.lang.String] = js.undefined
      var trustor: java.lang.String
    }
    
    @js.native
    sealed trait AuthFlags extends js.Object
    
    trait BumpSequence extends Operation {
      var bumpTo: java.lang.String
    }
    
    trait BumpSequenceOptions extends js.Object {
      var bumpTo: java.lang.String
      var source: js.UndefOr[java.lang.String] = js.undefined
    }
    
    trait ChangeTrust extends Operation {
      var limit: java.lang.String | scala.Double
      var line: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Asset
    }
    
    trait ChangeTrustOptions extends js.Object {
      var asset: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Asset
      var limit: js.UndefOr[java.lang.String] = js.undefined
      var source: js.UndefOr[java.lang.String] = js.undefined
    }
    
    trait CreateAccount extends Operation {
      var destination: java.lang.String
      @JSName("source")
      var source_CreateAccount: java.lang.String
      var startingBalance: java.lang.String | scala.Double
    }
    
    trait CreateAccountOptions extends js.Object {
      var destination: java.lang.String
      var source: js.UndefOr[java.lang.String] = js.undefined
      var startingBalance: java.lang.String
    }
    
    trait CreatePassiveOffer extends Operation {
      var amount: java.lang.String | scala.Double
      var buying: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Asset
      var price: java.lang.String | scala.Double
      var selling: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Asset
    }
    
    trait CreatePassiveOfferOptions extends js.Object {
      var amount: java.lang.String
      var buying: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Asset
      var price: scala.Double | java.lang.String | js.Object
      var selling: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Asset
      var source: js.UndefOr[java.lang.String] = js.undefined
    }
    
    trait Inflation extends Operation
    
    trait ManageData extends Operation {
      var name: java.lang.String
      var value: nodeLib.Buffer
    }
    
    trait ManageDataOptions extends js.Object {
      var name: java.lang.String
      var source: js.UndefOr[java.lang.String] = js.undefined
      var value: java.lang.String | nodeLib.Buffer
    }
    
    trait ManageOffer extends Operation {
      var amount: java.lang.String | scala.Double
      var buying: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Asset
      var offerId: java.lang.String
      var price: java.lang.String | scala.Double
      var selling: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Asset
    }
    
    trait ManageOfferOptions extends CreatePassiveOfferOptions {
      var offerId: js.UndefOr[scala.Double | java.lang.String] = js.undefined
    }
    
    trait Operation extends js.Object {
      var source: java.lang.String | scala.Null
      var `type`: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationType
    }
    
    trait PathPayment extends Operation {
      var destAmount: java.lang.String | scala.Double
      var destAsset: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Asset
      var destination: java.lang.String
      var path: js.Array[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Asset]
      var sendAsset: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Asset
      var sendMax: java.lang.String | scala.Double
    }
    
    trait PathPaymentOptions extends js.Object {
      var destAmount: java.lang.String
      var destAsset: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Asset
      var destination: java.lang.String
      var path: js.Array[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Asset]
      var sendAsset: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Asset
      var sendMax: java.lang.String
      var source: js.UndefOr[java.lang.String] = js.undefined
    }
    
    trait Payment extends Operation {
      var amount: java.lang.String | scala.Double
      var asset: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Asset
      var destination: java.lang.String
    }
    
    trait PaymentOptions extends js.Object {
      var amount: java.lang.String
      var asset: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Asset
      var destination: java.lang.String
      var source: js.UndefOr[java.lang.String] = js.undefined
    }
    
    trait SetOptions extends Operation {
      var clearFlags: js.UndefOr[AuthFlags] = js.undefined
      var highThreshold: js.UndefOr[scala.Double | java.lang.String] = js.undefined
      var homeDomain: js.UndefOr[java.lang.String] = js.undefined
      var inflationDest: js.UndefOr[java.lang.String] = js.undefined
      var lowThreshold: js.UndefOr[scala.Double | java.lang.String] = js.undefined
      var masterWeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
      var medThreshold: js.UndefOr[scala.Double | java.lang.String] = js.undefined
      var setFlags: js.UndefOr[AuthFlags] = js.undefined
      var signer: js.UndefOr[Signer] = js.undefined
    }
    
    trait SetOptionsOptions extends js.Object {
      var clearFlags: js.UndefOr[AuthFlags] = js.undefined
      var highThreshold: js.UndefOr[scala.Double | java.lang.String] = js.undefined
      var homeDomain: js.UndefOr[java.lang.String] = js.undefined
      var inflationDest: js.UndefOr[java.lang.String] = js.undefined
      var lowThreshold: js.UndefOr[scala.Double | java.lang.String] = js.undefined
      var masterWeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
      var medThreshold: js.UndefOr[scala.Double | java.lang.String] = js.undefined
      var setFlags: js.UndefOr[AuthFlags] = js.undefined
      var signer: js.UndefOr[Signer] = js.undefined
      var source: js.UndefOr[java.lang.String] = js.undefined
    }
    
    trait Signer extends js.Object {
      var ed25519PublicKey: js.UndefOr[java.lang.String] = js.undefined
      var preAuthTx: js.UndefOr[nodeLib.Buffer | java.lang.String] = js.undefined
      var sha256Hash: js.UndefOr[nodeLib.Buffer | java.lang.String] = js.undefined
      var weight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
    }
    
    def accountMerge(options: AccountMergeOptions): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Operation[AccountMerge] = js.native
    def allowTrust(options: AllowTrustOptions): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Operation[AllowTrust] = js.native
    def bumpSequence(options: BumpSequenceOptions): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Operation[BumpSequence] = js.native
    def changeTrust(options: ChangeTrustOptions): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Operation[ChangeTrust] = js.native
    def createAccount(options: CreateAccountOptions): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Operation[CreateAccount] = js.native
    def createPassiveOffer(options: CreatePassiveOfferOptions): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Operation[CreatePassiveOffer] = js.native
    def fromXDRObject[T /* <: Operation */](xdrOperation: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Operation[T]): T = js.native
    def inflation(options: stellarDashSdkLib.Anon_Source): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Operation[Inflation] = js.native
    def manageData(options: ManageDataOptions): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Operation[ManageData] = js.native
    def manageOffer(options: ManageOfferOptions): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Operation[ManageOffer] = js.native
    def pathPayment(options: PathPaymentOptions): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Operation[PathPayment] = js.native
    def payment(options: PaymentOptions): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Operation[Payment] = js.native
    def setOptions(options: SetOptionsOptions): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Operation[SetOptions] = js.native
    /*
      * Required = 1 << 0
      * Revocable = 1 << 1
      * Immutable = 1 << 2
      */
    @js.native
    object AuthFlags extends js.Object {
      @js.native
      sealed trait Immutable
        extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.AuthFlags
      
      @js.native
      sealed trait Required
        extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.AuthFlags
      
      @js.native
      sealed trait Revocable
        extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.AuthFlags
      
      /* 4 */ val Immutable: Immutable with scala.Double = js.native
      /* 1 */ val Required: Required with scala.Double = js.native
      /* 2 */ val Revocable: Revocable with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.AuthFlags with scala.Double
          ] = js.native
    }
    
  }
  
  @js.native
  object OperationType extends js.Object {
    @js.native
    sealed trait accountMerge
      extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationType
    
    @js.native
    sealed trait allowTrust
      extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationType
    
    @js.native
    sealed trait bumpSequence
      extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationType
    
    @js.native
    sealed trait changeTrust
      extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationType
    
    @js.native
    sealed trait createAccount
      extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationType
    
    @js.native
    sealed trait createPassiveOffer
      extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationType
    
    @js.native
    sealed trait inflation
      extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationType
    
    @js.native
    sealed trait manageData
      extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationType
    
    @js.native
    sealed trait manageOffer
      extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationType
    
    @js.native
    sealed trait pathPayment
      extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationType
    
    @js.native
    sealed trait payment
      extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationType
    
    @js.native
    sealed trait setOptions
      extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationType
    
    /* "accountMerge" */ val accountMerge: accountMerge with java.lang.String = js.native
    /* "allowTrust" */ val allowTrust: allowTrust with java.lang.String = js.native
    /* "bumpSequence" */ val bumpSequence: bumpSequence with java.lang.String = js.native
    /* "changeTrust" */ val changeTrust: changeTrust with java.lang.String = js.native
    /* "createAccount" */ val createAccount: createAccount with java.lang.String = js.native
    /* "createPassiveOffer" */ val createPassiveOffer: createPassiveOffer with java.lang.String = js.native
    /* "inflation" */ val inflation: inflation with java.lang.String = js.native
    /* "manageData" */ val manageData: manageData with java.lang.String = js.native
    /* "manageOffer" */ val manageOffer: manageOffer with java.lang.String = js.native
    /* "pathPayment" */ val pathPayment: pathPayment with java.lang.String = js.native
    /* "payment" */ val payment: payment with java.lang.String = js.native
    /* "setOptions" */ val setOptions: setOptions with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationType with java.lang.String
      ] = js.native
  }
  
  @JSName("StrKey")
  @js.native
  object StrKeyNs extends js.Object {
    def decodeEd25519PublicKey(data: java.lang.String): nodeLib.Buffer = js.native
    def decodeEd25519SecretSeed(data: java.lang.String): nodeLib.Buffer = js.native
    def decodePreAuthTx(data: java.lang.String): nodeLib.Buffer = js.native
    def decodeSha256Hash(data: java.lang.String): nodeLib.Buffer = js.native
    def encodeEd25519PublicKey(data: nodeLib.Buffer): java.lang.String = js.native
    def encodeEd25519SecretSeed(data: nodeLib.Buffer): java.lang.String = js.native
    def encodePreAuthTx(data: nodeLib.Buffer): java.lang.String = js.native
    def encodeSha256Hash(data: nodeLib.Buffer): java.lang.String = js.native
    def isValidEd25519PublicKey(Key: java.lang.String): scala.Boolean = js.native
    def isValidEd25519SecretSeed(seed: java.lang.String): scala.Boolean = js.native
  }
  
  @JSName("TransactionBuilder")
  @js.native
  object TransactionBuilderNs extends js.Object {
    trait TransactionBuilderOptions extends js.Object {
      var fee: js.UndefOr[scala.Double] = js.undefined
      var memo: js.UndefOr[
            stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Memo[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.MemoNs.AnyType]
          ] = js.undefined
      var timebounds: js.UndefOr[stellarDashSdkLib.Anon_MaxTime] = js.undefined
    }
    
  }
  
  @JSName("xdr")
  @js.native
  object xdrNs extends js.Object {
    @js.native
    class Asset () extends XDRStruct
    
    @js.native
    class DecoratedSignature protected () extends XDRStruct {
      def this(keys: stellarDashSdkLib.Anon_Hint) = this()
      def hint(): SignatureHint = js.native
      def signature(): nodeLib.Buffer = js.native
    }
    
    @js.native
    class Memo () extends XDRStruct
    
    @js.native
    class Operation[T /* <: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.Operation */] () extends XDRStruct
    
    @js.native
    class TransactionEnvelope () extends XDRStruct
    
    @js.native
    class TransactionResult () extends XDRStruct
    
    @js.native
    class XDRStruct () extends js.Object {
      def toXDR(): nodeLib.Buffer = js.native
      def toXDR(encoding: java.lang.String): java.lang.String = js.native
      @JSName("toXDR")
      def toXDR_Buffer(base: java.lang.String): nodeLib.Buffer = js.native
    }
    
    @js.native
    object Asset extends js.Object {
      def fromXDR(xdr: nodeLib.Buffer): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Asset = js.native
    }
    
    @js.native
    object DecoratedSignature extends js.Object {
      def fromXDR(xdr: nodeLib.Buffer): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.DecoratedSignature = js.native
    }
    
    @js.native
    object Memo extends js.Object {
      def fromXDR(xdr: nodeLib.Buffer): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Memo = js.native
    }
    
    @js.native
    object Operation extends js.Object {
      def fromXDR(xdr: nodeLib.Buffer): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Operation[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.Operation] = js.native
    }
    
    @js.native
    object TransactionEnvelope extends js.Object {
      def fromXDR(xdr: nodeLib.Buffer): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.TransactionEnvelope = js.native
    }
    
    @js.native
    object TransactionResult extends js.Object {
      def fromXDR(xdr: nodeLib.Buffer): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.TransactionResult = js.native
    }
    
    @js.native
    object XDRStruct extends js.Object {
      def fromXDR(xdr: nodeLib.Buffer): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.XDRStruct = js.native
    }
    
    type Signature = nodeLib.Buffer
    type SignatureHint = nodeLib.Buffer
  }
  
  type MemoHash = stellarDashSdkLib.stellarDashSdkLibStrings.hash
  type MemoID = stellarDashSdkLib.stellarDashSdkLibStrings.id
  type MemoNone = stellarDashSdkLib.stellarDashSdkLibStrings.none
  type MemoReturn = stellarDashSdkLib.stellarDashSdkLibStrings.`return`
  type MemoText = stellarDashSdkLib.stellarDashSdkLibStrings.text
  type TransactionOperation = stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.CreateAccount | stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.Payment | stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.PathPayment | stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.CreatePassiveOffer | stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.ManageOffer | stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.SetOptions | stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.ChangeTrust | stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.AllowTrust | stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.AccountMerge | stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.Inflation | stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.ManageData | stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.BumpSequence
}

