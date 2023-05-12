package typings.shippo

import typings.shippo.mod.Batch.ObjectResult
import typings.shippo.mod.CustomsDeclaration.B13aFilingOption
import typings.shippo.mod.CustomsDeclaration.EelPfc
import typings.shippo.mod.CustomsDeclaration._ContentsType
import typings.shippo.mod.CustomsDeclaration._NonDeliveryOption
import typings.shippo.mod.CustomsTaxIdentification._Type
import typings.shippo.mod.LabelFileType
import typings.shippo.mod.Manifest.Status
import typings.shippo.mod.ObjectState
import typings.shippo.mod.ParcelExtras.COD.PaymentMethod
import typings.shippo.mod.ParcelExtras.Insurance.Provider
import typings.shippo.mod.Rate.Attribute
import typings.shippo.mod.ShipmentExtras.Alcohol.RecipientType
import typings.shippo.mod.ShipmentExtras.AncillaryEndorsement
import typings.shippo.mod.ShipmentExtras.Billing.Type
import typings.shippo.mod.ShipmentExtras.DangerousGoodsCode
import typings.shippo.mod.ShipmentExtras.LasershipAttrs
import typings.shippo.mod.ShipmentExtras.PreferredDeliveryTimeframe
import typings.shippo.mod.ShipmentExtras.ReturnServiceType
import typings.shippo.mod.ShipmentExtras.SignatureConfirmation
import typings.shippo.mod.TrackingStatuses
import typings.shippo.mod._Carriers
import typings.shippo.mod._Country
import typings.shippo.mod._DistanceUnit
import typings.shippo.mod._FEDEXServiceLevel
import typings.shippo.mod._MassUnit
import typings.shippo.mod._UPSServiceLevel
import typings.shippo.mod._USPSServiceLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shippoStrings {
  
  @js.native
  sealed trait `01`
    extends StObject
       with DangerousGoodsCode
  inline def `01`: `01` = "01".asInstanceOf[`01`]
  
  @js.native
  sealed trait `02`
    extends StObject
       with DangerousGoodsCode
  inline def `02`: `02` = "02".asInstanceOf[`02`]
  
  @js.native
  sealed trait `03`
    extends StObject
       with DangerousGoodsCode
  inline def `03`: `03` = "03".asInstanceOf[`03`]
  
  @js.native
  sealed trait `04`
    extends StObject
       with DangerousGoodsCode
  inline def `04`: `04` = "04".asInstanceOf[`04`]
  
  @js.native
  sealed trait `05`
    extends StObject
       with DangerousGoodsCode
  inline def `05`: `05` = "05".asInstanceOf[`05`]
  
  @js.native
  sealed trait `06`
    extends StObject
       with DangerousGoodsCode
  inline def `06`: `06` = "06".asInstanceOf[`06`]
  
  @js.native
  sealed trait `07`
    extends StObject
       with DangerousGoodsCode
  inline def `07`: `07` = "07".asInstanceOf[`07`]
  
  @js.native
  sealed trait `08`
    extends StObject
       with DangerousGoodsCode
  inline def `08`: `08` = "08".asInstanceOf[`08`]
  
  @js.native
  sealed trait `09`
    extends StObject
       with DangerousGoodsCode
  inline def `09`: `09` = "09".asInstanceOf[`09`]
  
  @js.native
  sealed trait `10001200`
    extends StObject
       with PreferredDeliveryTimeframe
  inline def `10001200`: `10001200` = "10001200".asInstanceOf[`10001200`]
  
  @js.native
  sealed trait `12001400`
    extends StObject
       with PreferredDeliveryTimeframe
  inline def `12001400`: `12001400` = "12001400".asInstanceOf[`12001400`]
  
  @js.native
  sealed trait `14001600`
    extends StObject
       with PreferredDeliveryTimeframe
  inline def `14001600`: `14001600` = "14001600".asInstanceOf[`14001600`]
  
  @js.native
  sealed trait `16001800`
    extends StObject
       with PreferredDeliveryTimeframe
  inline def `16001800`: `16001800` = "16001800".asInstanceOf[`16001800`]
  
  @js.native
  sealed trait `18002000`
    extends StObject
       with PreferredDeliveryTimeframe
  inline def `18002000`: `18002000` = "18002000".asInstanceOf[`18002000`]
  
  @js.native
  sealed trait `19002100`
    extends StObject
       with PreferredDeliveryTimeframe
  inline def `19002100`: `19002100` = "19002100".asInstanceOf[`19002100`]
  
  @js.native
  sealed trait ABANDON
    extends StObject
       with _NonDeliveryOption
  inline def ABANDON: ABANDON = "ABANDON".asInstanceOf[ABANDON]
  
  @js.native
  sealed trait AD
    extends StObject
       with _Country
  inline def AD: AD = "AD".asInstanceOf[AD]
  
  @js.native
  sealed trait ADULT
    extends StObject
       with SignatureConfirmation
  inline def ADULT: ADULT = "ADULT".asInstanceOf[ADULT]
  
  @js.native
  sealed trait AE
    extends StObject
       with _Country
  inline def AE: AE = "AE".asInstanceOf[AE]
  
  @js.native
  sealed trait AES_ITN
    extends StObject
       with EelPfc
  inline def AES_ITN: AES_ITN = "AES_ITN".asInstanceOf[AES_ITN]
  
  @js.native
  sealed trait AF
    extends StObject
       with _Country
  inline def AF: AF = "AF".asInstanceOf[AF]
  
  @js.native
  sealed trait AG
    extends StObject
       with _Country
  inline def AG: AG = "AG".asInstanceOf[AG]
  
  @js.native
  sealed trait AI
    extends StObject
       with _Country
  inline def AI: AI = "AI".asInstanceOf[AI]
  
  @js.native
  sealed trait AL
    extends StObject
       with _Country
  inline def AL: AL = "AL".asInstanceOf[AL]
  
  @js.native
  sealed trait AM
    extends StObject
       with _Country
  inline def AM: AM = "AM".asInstanceOf[AM]
  
  @js.native
  sealed trait ANY
    extends StObject
       with PaymentMethod
       with typings.shippo.mod.ShipmentExtras.COD.PaymentMethod
  inline def ANY: ANY = "ANY".asInstanceOf[ANY]
  
  @js.native
  sealed trait AO
    extends StObject
       with _Country
  inline def AO: AO = "AO".asInstanceOf[AO]
  
  @js.native
  sealed trait AQ
    extends StObject
       with _Country
  inline def AQ: AQ = "AQ".asInstanceOf[AQ]
  
  @js.native
  sealed trait AR
    extends StObject
       with _Country
  inline def AR: AR = "AR".asInstanceOf[AR]
  
  @js.native
  sealed trait ARN
    extends StObject
       with _Type
  inline def ARN: ARN = "ARN".asInstanceOf[ARN]
  
  @js.native
  sealed trait AS
    extends StObject
       with _Country
  inline def AS: AS = "AS".asInstanceOf[AS]
  
  @js.native
  sealed trait AT
    extends StObject
       with _Country
  inline def AT: AT = "AT".asInstanceOf[AT]
  
  @js.native
  sealed trait ATTEMPT_1
    extends StObject
       with ReturnServiceType
  inline def ATTEMPT_1: ATTEMPT_1 = "ATTEMPT_1".asInstanceOf[ATTEMPT_1]
  
  @js.native
  sealed trait ATTEMPT_3
    extends StObject
       with ReturnServiceType
  inline def ATTEMPT_3: ATTEMPT_3 = "ATTEMPT_3".asInstanceOf[ATTEMPT_3]
  
  @js.native
  sealed trait AU
    extends StObject
       with _Country
  inline def AU: AU = "AU".asInstanceOf[AU]
  
  @js.native
  sealed trait AW
    extends StObject
       with _Country
  inline def AW: AW = "AW".asInstanceOf[AW]
  
  @js.native
  sealed trait AX
    extends StObject
       with _Country
  inline def AX: AX = "AX".asInstanceOf[AX]
  
  @js.native
  sealed trait AZ
    extends StObject
       with _Country
  inline def AZ: AZ = "AZ".asInstanceOf[AZ]
  
  @js.native
  sealed trait Alcohol
    extends StObject
       with LasershipAttrs
  inline def Alcohol: Alcohol = "Alcohol".asInstanceOf[Alcohol]
  
  @js.native
  sealed trait BA
    extends StObject
       with _Country
  inline def BA: BA = "BA".asInstanceOf[BA]
  
  @js.native
  sealed trait BB
    extends StObject
       with _Country
  inline def BB: BB = "BB".asInstanceOf[BB]
  
  @js.native
  sealed trait BD
    extends StObject
       with _Country
  inline def BD: BD = "BD".asInstanceOf[BD]
  
  @js.native
  sealed trait BE
    extends StObject
       with _Country
  inline def BE: BE = "BE".asInstanceOf[BE]
  
  @js.native
  sealed trait BESTVALUE
    extends StObject
       with Attribute
  inline def BESTVALUE: BESTVALUE = "BESTVALUE".asInstanceOf[BESTVALUE]
  
  @js.native
  sealed trait BF
    extends StObject
       with _Country
  inline def BF: BF = "BF".asInstanceOf[BF]
  
  @js.native
  sealed trait BG
    extends StObject
       with _Country
  inline def BG: BG = "BG".asInstanceOf[BG]
  
  @js.native
  sealed trait BH
    extends StObject
       with _Country
  inline def BH: BH = "BH".asInstanceOf[BH]
  
  @js.native
  sealed trait BI
    extends StObject
       with _Country
  inline def BI: BI = "BI".asInstanceOf[BI]
  
  @js.native
  sealed trait BJ
    extends StObject
       with _Country
  inline def BJ: BJ = "BJ".asInstanceOf[BJ]
  
  @js.native
  sealed trait BL
    extends StObject
       with _Country
  inline def BL: BL = "BL".asInstanceOf[BL]
  
  @js.native
  sealed trait BM
    extends StObject
       with _Country
  inline def BM: BM = "BM".asInstanceOf[BM]
  
  @js.native
  sealed trait BN
    extends StObject
       with _Country
  inline def BN: BN = "BN".asInstanceOf[BN]
  
  @js.native
  sealed trait BO
    extends StObject
       with _Country
  inline def BO: BO = "BO".asInstanceOf[BO]
  
  @js.native
  sealed trait BQ
    extends StObject
       with _Country
  inline def BQ: BQ = "BQ".asInstanceOf[BQ]
  
  @js.native
  sealed trait BR
    extends StObject
       with _Country
  inline def BR: BR = "BR".asInstanceOf[BR]
  
  @js.native
  sealed trait BS
    extends StObject
       with _Country
  inline def BS: BS = "BS".asInstanceOf[BS]
  
  @js.native
  sealed trait BT
    extends StObject
       with _Country
  inline def BT: BT = "BT".asInstanceOf[BT]
  
  @js.native
  sealed trait BV
    extends StObject
       with _Country
  inline def BV: BV = "BV".asInstanceOf[BV]
  
  @js.native
  sealed trait BW
    extends StObject
       with _Country
  inline def BW: BW = "BW".asInstanceOf[BW]
  
  @js.native
  sealed trait BY
    extends StObject
       with _Country
  inline def BY: BY = "BY".asInstanceOf[BY]
  
  @js.native
  sealed trait BZ
    extends StObject
       with _Country
  inline def BZ: BZ = "BZ".asInstanceOf[BZ]
  
  @js.native
  sealed trait CA
    extends StObject
       with _Country
  inline def CA: CA = "CA".asInstanceOf[CA]
  
  @js.native
  sealed trait CARRIER_CONFIRMATION
    extends StObject
       with SignatureConfirmation
  inline def CARRIER_CONFIRMATION: CARRIER_CONFIRMATION = "CARRIER_CONFIRMATION".asInstanceOf[CARRIER_CONFIRMATION]
  
  @js.native
  sealed trait CASH
    extends StObject
       with PaymentMethod
       with typings.shippo.mod.ShipmentExtras.COD.PaymentMethod
  inline def CASH: CASH = "CASH".asInstanceOf[CASH]
  
  @js.native
  sealed trait CC
    extends StObject
       with _Country
  inline def CC: CC = "CC".asInstanceOf[CC]
  
  @js.native
  sealed trait CD
    extends StObject
       with _Country
  inline def CD: CD = "CD".asInstanceOf[CD]
  
  @js.native
  sealed trait CERTIFIED
    extends StObject
       with SignatureConfirmation
  inline def CERTIFIED: CERTIFIED = "CERTIFIED".asInstanceOf[CERTIFIED]
  
  @js.native
  sealed trait CF
    extends StObject
       with _Country
  inline def CF: CF = "CF".asInstanceOf[CF]
  
  @js.native
  sealed trait CG
    extends StObject
       with _Country
  inline def CG: CG = "CG".asInstanceOf[CG]
  
  @js.native
  sealed trait CH
    extends StObject
       with _Country
  inline def CH: CH = "CH".asInstanceOf[CH]
  
  @js.native
  sealed trait CHEAPEST
    extends StObject
       with Attribute
  inline def CHEAPEST: CHEAPEST = "CHEAPEST".asInstanceOf[CHEAPEST]
  
  @js.native
  sealed trait CI
    extends StObject
       with _Country
  inline def CI: CI = "CI".asInstanceOf[CI]
  
  @js.native
  sealed trait CK
    extends StObject
       with _Country
  inline def CK: CK = "CK".asInstanceOf[CK]
  
  @js.native
  sealed trait CL
    extends StObject
       with _Country
  inline def CL: CL = "CL".asInstanceOf[CL]
  
  @js.native
  sealed trait CM
    extends StObject
       with _Country
  inline def CM: CM = "CM".asInstanceOf[CM]
  
  @js.native
  sealed trait CN
    extends StObject
       with _Country
  inline def CN: CN = "CN".asInstanceOf[CN]
  
  @js.native
  sealed trait CO
    extends StObject
       with _Country
  inline def CO: CO = "CO".asInstanceOf[CO]
  
  @js.native
  sealed trait CR
    extends StObject
       with _Country
  inline def CR: CR = "CR".asInstanceOf[CR]
  
  @js.native
  sealed trait CU
    extends StObject
       with _Country
  inline def CU: CU = "CU".asInstanceOf[CU]
  
  @js.native
  sealed trait CV
    extends StObject
       with _Country
  inline def CV: CV = "CV".asInstanceOf[CV]
  
  @js.native
  sealed trait CW
    extends StObject
       with _Country
  inline def CW: CW = "CW".asInstanceOf[CW]
  
  @js.native
  sealed trait CX
    extends StObject
       with _Country
  inline def CX: CX = "CX".asInstanceOf[CX]
  
  @js.native
  sealed trait CY
    extends StObject
       with _Country
  inline def CY: CY = "CY".asInstanceOf[CY]
  
  @js.native
  sealed trait CZ
    extends StObject
       with _Country
  inline def CZ: CZ = "CZ".asInstanceOf[CZ]
  
  @js.native
  sealed trait ControlledSubstance
    extends StObject
       with LasershipAttrs
  inline def ControlledSubstance: ControlledSubstance = "ControlledSubstance".asInstanceOf[ControlledSubstance]
  
  @js.native
  sealed trait DE
    extends StObject
       with _Country
  inline def DE: DE = "DE".asInstanceOf[DE]
  
  @js.native
  sealed trait DELIVERED
    extends StObject
       with TrackingStatuses
  inline def DELIVERED: DELIVERED = "DELIVERED".asInstanceOf[DELIVERED]
  
  @js.native
  sealed trait DJ
    extends StObject
       with _Country
  inline def DJ: DJ = "DJ".asInstanceOf[DJ]
  
  @js.native
  sealed trait DK
    extends StObject
       with _Country
  inline def DK: DK = "DK".asInstanceOf[DK]
  
  @js.native
  sealed trait DM
    extends StObject
       with _Country
  inline def DM: DM = "DM".asInstanceOf[DM]
  
  @js.native
  sealed trait DO
    extends StObject
       with _Country
  inline def DO: DO = "DO".asInstanceOf[DO]
  
  @js.native
  sealed trait DOCUMENTS
    extends StObject
       with _ContentsType
  inline def DOCUMENTS: DOCUMENTS = "DOCUMENTS".asInstanceOf[DOCUMENTS]
  
  @js.native
  sealed trait DZ
    extends StObject
       with _Country
  inline def DZ: DZ = "DZ".asInstanceOf[DZ]
  
  @js.native
  sealed trait DryIce
    extends StObject
       with LasershipAttrs
  inline def DryIce: DryIce = "DryIce".asInstanceOf[DryIce]
  
  @js.native
  sealed trait EC
    extends StObject
       with _Country
  inline def EC: EC = "EC".asInstanceOf[EC]
  
  @js.native
  sealed trait EE
    extends StObject
       with _Country
  inline def EE: EE = "EE".asInstanceOf[EE]
  
  @js.native
  sealed trait EG
    extends StObject
       with _Country
  inline def EG: EG = "EG".asInstanceOf[EG]
  
  @js.native
  sealed trait EH
    extends StObject
       with _Country
  inline def EH: EH = "EH".asInstanceOf[EH]
  
  @js.native
  sealed trait EIN
    extends StObject
       with _Type
  inline def EIN: EIN = "EIN".asInstanceOf[EIN]
  
  @js.native
  sealed trait ELECTRONIC_LABEL
    extends StObject
       with ReturnServiceType
  inline def ELECTRONIC_LABEL: ELECTRONIC_LABEL = "ELECTRONIC_LABEL".asInstanceOf[ELECTRONIC_LABEL]
  
  @js.native
  sealed trait ER
    extends StObject
       with _Country
  inline def ER: ER = "ER".asInstanceOf[ER]
  
  @js.native
  sealed trait ERROR
    extends StObject
       with Status
       with typings.shippo.mod.Transaction.Status
       with typings.shippo.mod.Shipment.Status
       with typings.shippo.mod.Refund.Status
  inline def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait ES
    extends StObject
       with _Country
  inline def ES: ES = "ES".asInstanceOf[ES]
  
  @js.native
  sealed trait ET
    extends StObject
       with _Country
  inline def ET: ET = "ET".asInstanceOf[ET]
  
  @js.native
  sealed trait Explosive
    extends StObject
       with LasershipAttrs
  inline def Explosive: Explosive = "Explosive".asInstanceOf[Explosive]
  
  @js.native
  sealed trait FAILURE
    extends StObject
       with TrackingStatuses
  inline def FAILURE: FAILURE = "FAILURE".asInstanceOf[FAILURE]
  
  @js.native
  sealed trait FASTEST
    extends StObject
       with Attribute
  inline def FASTEST: FASTEST = "FASTEST".asInstanceOf[FASTEST]
  
  @js.native
  sealed trait FEDEX
    extends StObject
       with Provider
       with typings.shippo.mod.ShipmentExtras.Insurance.Provider
  inline def FEDEX: FEDEX = "FEDEX".asInstanceOf[FEDEX]
  
  @js.native
  sealed trait FI
    extends StObject
       with _Country
  inline def FI: FI = "FI".asInstanceOf[FI]
  
  @js.native
  sealed trait FILED_ELECTRONICALLY
    extends StObject
       with B13aFilingOption
  inline def FILED_ELECTRONICALLY: FILED_ELECTRONICALLY = "FILED_ELECTRONICALLY".asInstanceOf[FILED_ELECTRONICALLY]
  
  @js.native
  sealed trait FJ
    extends StObject
       with _Country
  inline def FJ: FJ = "FJ".asInstanceOf[FJ]
  
  @js.native
  sealed trait FK
    extends StObject
       with _Country
  inline def FK: FK = "FK".asInstanceOf[FK]
  
  @js.native
  sealed trait FM
    extends StObject
       with _Country
  inline def FM: FM = "FM".asInstanceOf[FM]
  
  @js.native
  sealed trait FO
    extends StObject
       with _Country
  inline def FO: FO = "FO".asInstanceOf[FO]
  
  @js.native
  sealed trait FORWARDING_SERVICE_REQUESTED
    extends StObject
       with AncillaryEndorsement
  inline def FORWARDING_SERVICE_REQUESTED: FORWARDING_SERVICE_REQUESTED = "FORWARDING_SERVICE_REQUESTED".asInstanceOf[FORWARDING_SERVICE_REQUESTED]
  
  @js.native
  sealed trait FR
    extends StObject
       with _Country
  inline def FR: FR = "FR".asInstanceOf[FR]
  
  @js.native
  sealed trait GA
    extends StObject
       with _Country
  inline def GA: GA = "GA".asInstanceOf[GA]
  
  @js.native
  sealed trait GB
    extends StObject
       with _Country
  inline def GB: GB = "GB".asInstanceOf[GB]
  
  @js.native
  sealed trait GD
    extends StObject
       with _Country
  inline def GD: GD = "GD".asInstanceOf[GD]
  
  @js.native
  sealed trait GE
    extends StObject
       with _Country
  inline def GE: GE = "GE".asInstanceOf[GE]
  
  @js.native
  sealed trait GF
    extends StObject
       with _Country
  inline def GF: GF = "GF".asInstanceOf[GF]
  
  @js.native
  sealed trait GG
    extends StObject
       with _Country
  inline def GG: GG = "GG".asInstanceOf[GG]
  
  @js.native
  sealed trait GH
    extends StObject
       with _Country
  inline def GH: GH = "GH".asInstanceOf[GH]
  
  @js.native
  sealed trait GI
    extends StObject
       with _Country
  inline def GI: GI = "GI".asInstanceOf[GI]
  
  @js.native
  sealed trait GIFT
    extends StObject
       with _ContentsType
  inline def GIFT: GIFT = "GIFT".asInstanceOf[GIFT]
  
  @js.native
  sealed trait GL
    extends StObject
       with _Country
  inline def GL: GL = "GL".asInstanceOf[GL]
  
  @js.native
  sealed trait GM
    extends StObject
       with _Country
  inline def GM: GM = "GM".asInstanceOf[GM]
  
  @js.native
  sealed trait GN
    extends StObject
       with _Country
  inline def GN: GN = "GN".asInstanceOf[GN]
  
  @js.native
  sealed trait GP
    extends StObject
       with _Country
  inline def GP: GP = "GP".asInstanceOf[GP]
  
  @js.native
  sealed trait GQ
    extends StObject
       with _Country
  inline def GQ: GQ = "GQ".asInstanceOf[GQ]
  
  @js.native
  sealed trait GR
    extends StObject
       with _Country
  inline def GR: GR = "GR".asInstanceOf[GR]
  
  @js.native
  sealed trait GS
    extends StObject
       with _Country
  inline def GS: GS = "GS".asInstanceOf[GS]
  
  @js.native
  sealed trait GT
    extends StObject
       with _Country
  inline def GT: GT = "GT".asInstanceOf[GT]
  
  @js.native
  sealed trait GU
    extends StObject
       with _Country
  inline def GU: GU = "GU".asInstanceOf[GU]
  
  @js.native
  sealed trait GW
    extends StObject
       with _Country
  inline def GW: GW = "GW".asInstanceOf[GW]
  
  @js.native
  sealed trait GY
    extends StObject
       with _Country
  inline def GY: GY = "GY".asInstanceOf[GY]
  
  @js.native
  sealed trait HK
    extends StObject
       with _Country
  inline def HK: HK = "HK".asInstanceOf[HK]
  
  @js.native
  sealed trait HM
    extends StObject
       with _Country
  inline def HM: HM = "HM".asInstanceOf[HM]
  
  @js.native
  sealed trait HN
    extends StObject
       with _Country
  inline def HN: HN = "HN".asInstanceOf[HN]
  
  @js.native
  sealed trait HR
    extends StObject
       with _Country
  inline def HR: HR = "HR".asInstanceOf[HR]
  
  @js.native
  sealed trait HT
    extends StObject
       with _Country
  inline def HT: HT = "HT".asInstanceOf[HT]
  
  @js.native
  sealed trait HU
    extends StObject
       with _Country
  inline def HU: HU = "HU".asInstanceOf[HU]
  
  @js.native
  sealed trait HUMANITARIAN_DONATION
    extends StObject
       with _ContentsType
  inline def HUMANITARIAN_DONATION: HUMANITARIAN_DONATION = "HUMANITARIAN_DONATION".asInstanceOf[HUMANITARIAN_DONATION]
  
  @js.native
  sealed trait Hazmat
    extends StObject
       with LasershipAttrs
  inline def Hazmat: Hazmat = "Hazmat".asInstanceOf[Hazmat]
  
  @js.native
  sealed trait ID
    extends StObject
       with _Country
  inline def ID: ID = "ID".asInstanceOf[ID]
  
  @js.native
  sealed trait IE
    extends StObject
       with _Country
  inline def IE: IE = "IE".asInstanceOf[IE]
  
  @js.native
  sealed trait IL
    extends StObject
       with _Country
  inline def IL: IL = "IL".asInstanceOf[IL]
  
  @js.native
  sealed trait IM
    extends StObject
       with _Country
  inline def IM: IM = "IM".asInstanceOf[IM]
  
  @js.native
  sealed trait IN
    extends StObject
       with _Country
  inline def IN: IN = "IN".asInstanceOf[IN]
  
  @js.native
  sealed trait INCOMPLETE
    extends StObject
       with typings.shippo.mod.Batch.Shipment.Status
  inline def INCOMPLETE: INCOMPLETE = "INCOMPLETE".asInstanceOf[INCOMPLETE]
  
  @js.native
  sealed trait INDIRECT
    extends StObject
       with SignatureConfirmation
  inline def INDIRECT: INDIRECT = "INDIRECT".asInstanceOf[INDIRECT]
  
  @js.native
  sealed trait INVALID
    extends StObject
       with ObjectState
       with typings.shippo.mod.Batch.Shipment.Status
       with typings.shippo.mod.Batch.Status
  inline def INVALID: INVALID = "INVALID".asInstanceOf[INVALID]
  
  @js.native
  sealed trait IO
    extends StObject
       with _Country
  inline def IO: IO = "IO".asInstanceOf[IO]
  
  @js.native
  sealed trait IOSS
    extends StObject
       with _Type
  inline def IOSS: IOSS = "IOSS".asInstanceOf[IOSS]
  
  @js.native
  sealed trait IQ
    extends StObject
       with _Country
  inline def IQ: IQ = "IQ".asInstanceOf[IQ]
  
  @js.native
  sealed trait IR
    extends StObject
       with _Country
  inline def IR: IR = "IR".asInstanceOf[IR]
  
  @js.native
  sealed trait IS
    extends StObject
       with _Country
  inline def IS: IS = "IS".asInstanceOf[IS]
  
  @js.native
  sealed trait IT
    extends StObject
       with _Country
  inline def IT: IT = "IT".asInstanceOf[IT]
  
  @js.native
  sealed trait JE
    extends StObject
       with _Country
  inline def JE: JE = "JE".asInstanceOf[JE]
  
  @js.native
  sealed trait JM
    extends StObject
       with _Country
  inline def JM: JM = "JM".asInstanceOf[JM]
  
  @js.native
  sealed trait JO
    extends StObject
       with _Country
  inline def JO: JO = "JO".asInstanceOf[JO]
  
  @js.native
  sealed trait JP
    extends StObject
       with _Country
  inline def JP: JP = "JP".asInstanceOf[JP]
  
  @js.native
  sealed trait KE
    extends StObject
       with _Country
  inline def KE: KE = "KE".asInstanceOf[KE]
  
  @js.native
  sealed trait KG
    extends StObject
       with _Country
  inline def KG: KG = "KG".asInstanceOf[KG]
  
  @js.native
  sealed trait KH
    extends StObject
       with _Country
  inline def KH: KH = "KH".asInstanceOf[KH]
  
  @js.native
  sealed trait KI
    extends StObject
       with _Country
  inline def KI: KI = "KI".asInstanceOf[KI]
  
  @js.native
  sealed trait KM
    extends StObject
       with _Country
  inline def KM: KM = "KM".asInstanceOf[KM]
  
  @js.native
  sealed trait KN
    extends StObject
       with _Country
  inline def KN: KN = "KN".asInstanceOf[KN]
  
  @js.native
  sealed trait KP
    extends StObject
       with _Country
  inline def KP: KP = "KP".asInstanceOf[KP]
  
  @js.native
  sealed trait KR
    extends StObject
       with _Country
  inline def KR: KR = "KR".asInstanceOf[KR]
  
  @js.native
  sealed trait KW
    extends StObject
       with _Country
  inline def KW: KW = "KW".asInstanceOf[KW]
  
  @js.native
  sealed trait KY
    extends StObject
       with _Country
  inline def KY: KY = "KY".asInstanceOf[KY]
  
  @js.native
  sealed trait KZ
    extends StObject
       with _Country
  inline def KZ: KZ = "KZ".asInstanceOf[KZ]
  
  @js.native
  sealed trait LA
    extends StObject
       with _Country
  inline def LA: LA = "LA".asInstanceOf[LA]
  
  @js.native
  sealed trait LB
    extends StObject
       with _Country
  inline def LB: LB = "LB".asInstanceOf[LB]
  
  @js.native
  sealed trait LC
    extends StObject
       with _Country
  inline def LC: LC = "LC".asInstanceOf[LC]
  
  @js.native
  sealed trait LI
    extends StObject
       with _Country
  inline def LI: LI = "LI".asInstanceOf[LI]
  
  @js.native
  sealed trait LK
    extends StObject
       with _Country
  inline def LK: LK = "LK".asInstanceOf[LK]
  
  @js.native
  sealed trait LR
    extends StObject
       with _Country
  inline def LR: LR = "LR".asInstanceOf[LR]
  
  @js.native
  sealed trait LS
    extends StObject
       with _Country
  inline def LS: LS = "LS".asInstanceOf[LS]
  
  @js.native
  sealed trait LT
    extends StObject
       with _Country
  inline def LT: LT = "LT".asInstanceOf[LT]
  
  @js.native
  sealed trait LU
    extends StObject
       with _Country
  inline def LU: LU = "LU".asInstanceOf[LU]
  
  @js.native
  sealed trait LV
    extends StObject
       with _Country
  inline def LV: LV = "LV".asInstanceOf[LV]
  
  @js.native
  sealed trait LY
    extends StObject
       with _Country
  inline def LY: LY = "LY".asInstanceOf[LY]
  
  @js.native
  sealed trait MA
    extends StObject
       with _Country
  inline def MA: MA = "MA".asInstanceOf[MA]
  
  @js.native
  sealed trait MC
    extends StObject
       with _Country
  inline def MC: MC = "MC".asInstanceOf[MC]
  
  @js.native
  sealed trait MD
    extends StObject
       with _Country
  inline def MD: MD = "MD".asInstanceOf[MD]
  
  @js.native
  sealed trait ME
    extends StObject
       with _Country
  inline def ME: ME = "ME".asInstanceOf[ME]
  
  @js.native
  sealed trait MERCHANDISE
    extends StObject
       with _ContentsType
  inline def MERCHANDISE: MERCHANDISE = "MERCHANDISE".asInstanceOf[MERCHANDISE]
  
  @js.native
  sealed trait MF
    extends StObject
       with _Country
  inline def MF: MF = "MF".asInstanceOf[MF]
  
  @js.native
  sealed trait MG
    extends StObject
       with _Country
  inline def MG: MG = "MG".asInstanceOf[MG]
  
  @js.native
  sealed trait MH
    extends StObject
       with _Country
  inline def MH: MH = "MH".asInstanceOf[MH]
  
  @js.native
  sealed trait MK
    extends StObject
       with _Country
  inline def MK: MK = "MK".asInstanceOf[MK]
  
  @js.native
  sealed trait ML
    extends StObject
       with _Country
  inline def ML: ML = "ML".asInstanceOf[ML]
  
  @js.native
  sealed trait MM
    extends StObject
       with _Country
  inline def MM: MM = "MM".asInstanceOf[MM]
  
  @js.native
  sealed trait MN
    extends StObject
       with _Country
  inline def MN: MN = "MN".asInstanceOf[MN]
  
  @js.native
  sealed trait MO
    extends StObject
       with _Country
  inline def MO: MO = "MO".asInstanceOf[MO]
  
  @js.native
  sealed trait MP
    extends StObject
       with _Country
  inline def MP: MP = "MP".asInstanceOf[MP]
  
  @js.native
  sealed trait MQ
    extends StObject
       with _Country
  inline def MQ: MQ = "MQ".asInstanceOf[MQ]
  
  @js.native
  sealed trait MR
    extends StObject
       with _Country
  inline def MR: MR = "MR".asInstanceOf[MR]
  
  @js.native
  sealed trait MS
    extends StObject
       with _Country
  inline def MS: MS = "MS".asInstanceOf[MS]
  
  @js.native
  sealed trait MT
    extends StObject
       with _Country
  inline def MT: MT = "MT".asInstanceOf[MT]
  
  @js.native
  sealed trait MU
    extends StObject
       with _Country
  inline def MU: MU = "MU".asInstanceOf[MU]
  
  @js.native
  sealed trait MV
    extends StObject
       with _Country
  inline def MV: MV = "MV".asInstanceOf[MV]
  
  @js.native
  sealed trait MW
    extends StObject
       with _Country
  inline def MW: MW = "MW".asInstanceOf[MW]
  
  @js.native
  sealed trait MX
    extends StObject
       with _Country
  inline def MX: MX = "MX".asInstanceOf[MX]
  
  @js.native
  sealed trait MY
    extends StObject
       with _Country
  inline def MY: MY = "MY".asInstanceOf[MY]
  
  @js.native
  sealed trait MZ
    extends StObject
       with _Country
  inline def MZ: MZ = "MZ".asInstanceOf[MZ]
  
  @js.native
  sealed trait NA
    extends StObject
       with _Country
  inline def NA: NA = "NA".asInstanceOf[NA]
  
  @js.native
  sealed trait NC
    extends StObject
       with _Country
  inline def NC: NC = "NC".asInstanceOf[NC]
  
  @js.native
  sealed trait NE
    extends StObject
       with _Country
  inline def NE: NE = "NE".asInstanceOf[NE]
  
  @js.native
  sealed trait NF
    extends StObject
       with _Country
  inline def NF: NF = "NF".asInstanceOf[NF]
  
  @js.native
  sealed trait NG
    extends StObject
       with _Country
  inline def NG: NG = "NG".asInstanceOf[NG]
  
  @js.native
  sealed trait NI
    extends StObject
       with _Country
  inline def NI: NI = "NI".asInstanceOf[NI]
  
  @js.native
  sealed trait NL
    extends StObject
       with _Country
  inline def NL: NL = "NL".asInstanceOf[NL]
  
  @js.native
  sealed trait NO
    extends StObject
       with _Country
  inline def NO: NO = "NO".asInstanceOf[NO]
  
  @js.native
  sealed trait NOEEI_30_36
    extends StObject
       with EelPfc
  inline def NOEEI_30_36: NOEEI_30_36 = "NOEEI_30_36".asInstanceOf[NOEEI_30_36]
  
  @js.native
  sealed trait NOEEI_30_37_a
    extends StObject
       with EelPfc
  inline def NOEEI_30_37_a: NOEEI_30_37_a = "NOEEI_30_37_a".asInstanceOf[NOEEI_30_37_a]
  
  @js.native
  sealed trait NOEEI_30_37_f
    extends StObject
       with EelPfc
  inline def NOEEI_30_37_f: NOEEI_30_37_f = "NOEEI_30_37_f".asInstanceOf[NOEEI_30_37_f]
  
  @js.native
  sealed trait NOEEI_30_37_h
    extends StObject
       with EelPfc
  inline def NOEEI_30_37_h: NOEEI_30_37_h = "NOEEI_30_37_h".asInstanceOf[NOEEI_30_37_h]
  
  @js.native
  sealed trait NOT_REQUIRED
    extends StObject
       with B13aFilingOption
  inline def NOT_REQUIRED: NOT_REQUIRED = "NOT_REQUIRED".asInstanceOf[NOT_REQUIRED]
  
  @js.native
  sealed trait NP
    extends StObject
       with _Country
  inline def NP: NP = "NP".asInstanceOf[NP]
  
  @js.native
  sealed trait NR
    extends StObject
       with _Country
  inline def NR: NR = "NR".asInstanceOf[NR]
  
  @js.native
  sealed trait NU
    extends StObject
       with _Country
  inline def NU: NU = "NU".asInstanceOf[NU]
  
  @js.native
  sealed trait NZ
    extends StObject
       with _Country
  inline def NZ: NZ = "NZ".asInstanceOf[NZ]
  
  @js.native
  sealed trait NoRTS
    extends StObject
       with LasershipAttrs
  inline def NoRTS: NoRTS = "NoRTS".asInstanceOf[NoRTS]
  
  @js.native
  sealed trait OM
    extends StObject
       with _Country
  inline def OM: OM = "OM".asInstanceOf[OM]
  
  @js.native
  sealed trait ONTRAC
    extends StObject
       with typings.shippo.mod.ShipmentExtras.Insurance.Provider
  inline def ONTRAC: ONTRAC = "ONTRAC".asInstanceOf[ONTRAC]
  
  @js.native
  sealed trait OTHER
    extends StObject
       with _ContentsType
  inline def OTHER: OTHER = "OTHER".asInstanceOf[OTHER]
  
  @js.native
  sealed trait PA
    extends StObject
       with _Country
  inline def PA: PA = "PA".asInstanceOf[PA]
  
  @js.native
  sealed trait PDF
    extends StObject
       with LabelFileType
  inline def PDF: PDF = "PDF".asInstanceOf[PDF]
  
  @js.native
  sealed trait PDF_2Dot3x7Dot5
    extends StObject
       with LabelFileType
  inline def PDF_2Dot3x7Dot5: PDF_2Dot3x7Dot5 = "PDF_2.3x7.5".asInstanceOf[PDF_2Dot3x7Dot5]
  
  @js.native
  sealed trait PDF_4x6
    extends StObject
       with LabelFileType
  inline def PDF_4x6: PDF_4x6 = "PDF_4x6".asInstanceOf[PDF_4x6]
  
  @js.native
  sealed trait PDF_4x8
    extends StObject
       with LabelFileType
  inline def PDF_4x8: PDF_4x8 = "PDF_4x8".asInstanceOf[PDF_4x8]
  
  @js.native
  sealed trait PDF_A4
    extends StObject
       with LabelFileType
  inline def PDF_A4: PDF_A4 = "PDF_A4".asInstanceOf[PDF_A4]
  
  @js.native
  sealed trait PDF_A6
    extends StObject
       with LabelFileType
  inline def PDF_A6: PDF_A6 = "PDF_A6".asInstanceOf[PDF_A6]
  
  @js.native
  sealed trait PE
    extends StObject
       with _Country
  inline def PE: PE = "PE".asInstanceOf[PE]
  
  @js.native
  sealed trait PENDING
    extends StObject
       with typings.shippo.mod.Refund.Status
  inline def PENDING: PENDING = "PENDING".asInstanceOf[PENDING]
  
  @js.native
  sealed trait PF
    extends StObject
       with _Country
  inline def PF: PF = "PF".asInstanceOf[PF]
  
  @js.native
  sealed trait PG
    extends StObject
       with _Country
  inline def PG: PG = "PG".asInstanceOf[PG]
  
  @js.native
  sealed trait PH
    extends StObject
       with _Country
  inline def PH: PH = "PH".asInstanceOf[PH]
  
  @js.native
  sealed trait PK
    extends StObject
       with _Country
  inline def PK: PK = "PK".asInstanceOf[PK]
  
  @js.native
  sealed trait PL
    extends StObject
       with _Country
  inline def PL: PL = "PL".asInstanceOf[PL]
  
  @js.native
  sealed trait PM
    extends StObject
       with _Country
  inline def PM: PM = "PM".asInstanceOf[PM]
  
  @js.native
  sealed trait PN
    extends StObject
       with _Country
  inline def PN: PN = "PN".asInstanceOf[PN]
  
  @js.native
  sealed trait PNG
    extends StObject
       with LabelFileType
  inline def PNG: PNG = "PNG".asInstanceOf[PNG]
  
  @js.native
  sealed trait PNG_2Dot3x7Dot5
    extends StObject
       with LabelFileType
  inline def PNG_2Dot3x7Dot5: PNG_2Dot3x7Dot5 = "PNG_2.3x7.5".asInstanceOf[PNG_2Dot3x7Dot5]
  
  @js.native
  sealed trait PR
    extends StObject
       with _Country
  inline def PR: PR = "PR".asInstanceOf[PR]
  
  @js.native
  sealed trait PRE_TRANSIT
    extends StObject
       with TrackingStatuses
  inline def PRE_TRANSIT: PRE_TRANSIT = "PRE_TRANSIT".asInstanceOf[PRE_TRANSIT]
  
  @js.native
  sealed trait PRINT_AND_MAIL
    extends StObject
       with ReturnServiceType
  inline def PRINT_AND_MAIL: PRINT_AND_MAIL = "PRINT_AND_MAIL".asInstanceOf[PRINT_AND_MAIL]
  
  @js.native
  sealed trait PS
    extends StObject
       with _Country
  inline def PS: PS = "PS".asInstanceOf[PS]
  
  @js.native
  sealed trait PT
    extends StObject
       with _Country
  inline def PT: PT = "PT".asInstanceOf[PT]
  
  @js.native
  sealed trait PURCHASED
    extends StObject
       with typings.shippo.mod.Batch.Status
  inline def PURCHASED: PURCHASED = "PURCHASED".asInstanceOf[PURCHASED]
  
  @js.native
  sealed trait PURCHASING
    extends StObject
       with typings.shippo.mod.Batch.Status
  inline def PURCHASING: PURCHASING = "PURCHASING".asInstanceOf[PURCHASING]
  
  @js.native
  sealed trait PW
    extends StObject
       with _Country
  inline def PW: PW = "PW".asInstanceOf[PW]
  
  @js.native
  sealed trait PY
    extends StObject
       with _Country
  inline def PY: PY = "PY".asInstanceOf[PY]
  
  @js.native
  sealed trait Perishable
    extends StObject
       with LasershipAttrs
  inline def Perishable: Perishable = "Perishable".asInstanceOf[Perishable]
  
  @js.native
  sealed trait QA
    extends StObject
       with _Country
  inline def QA: QA = "QA".asInstanceOf[QA]
  
  @js.native
  sealed trait QUEUED
    extends StObject
       with Status
       with typings.shippo.mod.Transaction.Status
       with typings.shippo.mod.Shipment.Status
       with typings.shippo.mod.Refund.Status
  inline def QUEUED: QUEUED = "QUEUED".asInstanceOf[QUEUED]
  
  @js.native
  sealed trait RE
    extends StObject
       with _Country
  inline def RE: RE = "RE".asInstanceOf[RE]
  
  @js.native
  sealed trait RECIPIENT
    extends StObject
       with Type
  inline def RECIPIENT: RECIPIENT = "RECIPIENT".asInstanceOf[RECIPIENT]
  
  @js.native
  sealed trait REFUNDED
    extends StObject
       with typings.shippo.mod.Transaction.Status
  inline def REFUNDED: REFUNDED = "REFUNDED".asInstanceOf[REFUNDED]
  
  @js.native
  sealed trait REFUNDPENDING
    extends StObject
       with typings.shippo.mod.Transaction.Status
  inline def REFUNDPENDING: REFUNDPENDING = "REFUNDPENDING".asInstanceOf[REFUNDPENDING]
  
  @js.native
  sealed trait REFUNDREJECTED
    extends StObject
       with typings.shippo.mod.Transaction.Status
  inline def REFUNDREJECTED: REFUNDREJECTED = "REFUNDREJECTED".asInstanceOf[REFUNDREJECTED]
  
  @js.native
  sealed trait RETURN
    extends StObject
       with _NonDeliveryOption
  inline def RETURN: RETURN = "RETURN".asInstanceOf[RETURN]
  
  @js.native
  sealed trait RETURNED
    extends StObject
       with TrackingStatuses
  inline def RETURNED: RETURNED = "RETURNED".asInstanceOf[RETURNED]
  
  @js.native
  sealed trait RETURN_MERCHANDISE
    extends StObject
       with _ContentsType
  inline def RETURN_MERCHANDISE: RETURN_MERCHANDISE = "RETURN_MERCHANDISE".asInstanceOf[RETURN_MERCHANDISE]
  
  @js.native
  sealed trait RETURN_SERVICE_REQUESTED
    extends StObject
       with AncillaryEndorsement
  inline def RETURN_SERVICE_REQUESTED: RETURN_SERVICE_REQUESTED = "RETURN_SERVICE_REQUESTED".asInstanceOf[RETURN_SERVICE_REQUESTED]
  
  @js.native
  sealed trait RO
    extends StObject
       with _Country
  inline def RO: RO = "RO".asInstanceOf[RO]
  
  @js.native
  sealed trait RS
    extends StObject
       with _Country
  inline def RS: RS = "RS".asInstanceOf[RS]
  
  @js.native
  sealed trait RU
    extends StObject
       with _Country
  inline def RU: RU = "RU".asInstanceOf[RU]
  
  @js.native
  sealed trait RW
    extends StObject
       with _Country
  inline def RW: RW = "RW".asInstanceOf[RW]
  
  @js.native
  sealed trait Refrigerated
    extends StObject
       with LasershipAttrs
  inline def Refrigerated: Refrigerated = "Refrigerated".asInstanceOf[Refrigerated]
  
  @js.native
  sealed trait SA
    extends StObject
       with _Country
  inline def SA: SA = "SA".asInstanceOf[SA]
  
  @js.native
  sealed trait SAMPLE
    extends StObject
       with _ContentsType
  inline def SAMPLE: SAMPLE = "SAMPLE".asInstanceOf[SAMPLE]
  
  @js.native
  sealed trait SB
    extends StObject
       with _Country
  inline def SB: SB = "SB".asInstanceOf[SB]
  
  @js.native
  sealed trait SC
    extends StObject
       with _Country
  inline def SC: SC = "SC".asInstanceOf[SC]
  
  @js.native
  sealed trait SD
    extends StObject
       with _Country
  inline def SD: SD = "SD".asInstanceOf[SD]
  
  @js.native
  sealed trait SE
    extends StObject
       with _Country
  inline def SE: SE = "SE".asInstanceOf[SE]
  
  @js.native
  sealed trait SECURED_FUNDS
    extends StObject
       with PaymentMethod
       with typings.shippo.mod.ShipmentExtras.COD.PaymentMethod
  inline def SECURED_FUNDS: SECURED_FUNDS = "SECURED_FUNDS".asInstanceOf[SECURED_FUNDS]
  
  @js.native
  sealed trait SENDER
    extends StObject
       with Type
  inline def SENDER: SENDER = "SENDER".asInstanceOf[SENDER]
  
  @js.native
  sealed trait SG
    extends StObject
       with _Country
  inline def SG: SG = "SG".asInstanceOf[SG]
  
  @js.native
  sealed trait SH
    extends StObject
       with _Country
  inline def SH: SH = "SH".asInstanceOf[SH]
  
  @js.native
  sealed trait SI
    extends StObject
       with _Country
  inline def SI: SI = "SI".asInstanceOf[SI]
  
  @js.native
  sealed trait SJ
    extends StObject
       with _Country
  inline def SJ: SJ = "SJ".asInstanceOf[SJ]
  
  @js.native
  sealed trait SK
    extends StObject
       with _Country
  inline def SK: SK = "SK".asInstanceOf[SK]
  
  @js.native
  sealed trait SL
    extends StObject
       with _Country
  inline def SL: SL = "SL".asInstanceOf[SL]
  
  @js.native
  sealed trait SM
    extends StObject
       with _Country
  inline def SM: SM = "SM".asInstanceOf[SM]
  
  @js.native
  sealed trait SN
    extends StObject
       with _Country
  inline def SN: SN = "SN".asInstanceOf[SN]
  
  @js.native
  sealed trait SO
    extends StObject
       with _Country
  inline def SO: SO = "SO".asInstanceOf[SO]
  
  @js.native
  sealed trait SR
    extends StObject
       with _Country
  inline def SR: SR = "SR".asInstanceOf[SR]
  
  @js.native
  sealed trait SS
    extends StObject
       with _Country
  inline def SS: SS = "SS".asInstanceOf[SS]
  
  @js.native
  sealed trait ST
    extends StObject
       with _Country
  inline def ST: ST = "ST".asInstanceOf[ST]
  
  @js.native
  sealed trait STANDARD
    extends StObject
       with SignatureConfirmation
  inline def STANDARD: STANDARD = "STANDARD".asInstanceOf[STANDARD]
  
  @js.native
  sealed trait SUCCESS
    extends StObject
       with Status
       with typings.shippo.mod.Transaction.Status
       with typings.shippo.mod.Shipment.Status
       with typings.shippo.mod.Refund.Status
  inline def SUCCESS: SUCCESS = "SUCCESS".asInstanceOf[SUCCESS]
  
  @js.native
  sealed trait SUMMARY_REPORTING
    extends StObject
       with B13aFilingOption
  inline def SUMMARY_REPORTING: SUMMARY_REPORTING = "SUMMARY_REPORTING".asInstanceOf[SUMMARY_REPORTING]
  
  @js.native
  sealed trait SV
    extends StObject
       with _Country
  inline def SV: SV = "SV".asInstanceOf[SV]
  
  @js.native
  sealed trait SX
    extends StObject
       with _Country
  inline def SX: SX = "SX".asInstanceOf[SX]
  
  @js.native
  sealed trait SY
    extends StObject
       with _Country
  inline def SY: SY = "SY".asInstanceOf[SY]
  
  @js.native
  sealed trait SZ
    extends StObject
       with _Country
  inline def SZ: SZ = "SZ".asInstanceOf[SZ]
  
  @js.native
  sealed trait TC
    extends StObject
       with _Country
  inline def TC: TC = "TC".asInstanceOf[TC]
  
  @js.native
  sealed trait TD
    extends StObject
       with _Country
  inline def TD: TD = "TD".asInstanceOf[TD]
  
  @js.native
  sealed trait TF
    extends StObject
       with _Country
  inline def TF: TF = "TF".asInstanceOf[TF]
  
  @js.native
  sealed trait TG
    extends StObject
       with _Country
  inline def TG: TG = "TG".asInstanceOf[TG]
  
  @js.native
  sealed trait TH
    extends StObject
       with _Country
  inline def TH: TH = "TH".asInstanceOf[TH]
  
  @js.native
  sealed trait THIRD_PARTY
    extends StObject
       with Type
  inline def THIRD_PARTY: THIRD_PARTY = "THIRD_PARTY".asInstanceOf[THIRD_PARTY]
  
  @js.native
  sealed trait THIRD_PARTY_CONSIGNEE
    extends StObject
       with Type
  inline def THIRD_PARTY_CONSIGNEE: THIRD_PARTY_CONSIGNEE = "THIRD_PARTY_CONSIGNEE".asInstanceOf[THIRD_PARTY_CONSIGNEE]
  
  @js.native
  sealed trait TJ
    extends StObject
       with _Country
  inline def TJ: TJ = "TJ".asInstanceOf[TJ]
  
  @js.native
  sealed trait TK
    extends StObject
       with _Country
  inline def TK: TK = "TK".asInstanceOf[TK]
  
  @js.native
  sealed trait TL
    extends StObject
       with _Country
  inline def TL: TL = "TL".asInstanceOf[TL]
  
  @js.native
  sealed trait TM
    extends StObject
       with _Country
  inline def TM: TM = "TM".asInstanceOf[TM]
  
  @js.native
  sealed trait TN
    extends StObject
       with _Country
  inline def TN: TN = "TN".asInstanceOf[TN]
  
  @js.native
  sealed trait TO
    extends StObject
       with _Country
  inline def TO: TO = "TO".asInstanceOf[TO]
  
  @js.native
  sealed trait TR
    extends StObject
       with _Country
  inline def TR: TR = "TR".asInstanceOf[TR]
  
  @js.native
  sealed trait TRANSACTION_FAILED
    extends StObject
       with typings.shippo.mod.Batch.Shipment.Status
  inline def TRANSACTION_FAILED: TRANSACTION_FAILED = "TRANSACTION_FAILED".asInstanceOf[TRANSACTION_FAILED]
  
  @js.native
  sealed trait TRANSIT
    extends StObject
       with TrackingStatuses
  inline def TRANSIT: TRANSIT = "TRANSIT".asInstanceOf[TRANSIT]
  
  @js.native
  sealed trait TT
    extends StObject
       with _Country
  inline def TT: TT = "TT".asInstanceOf[TT]
  
  @js.native
  sealed trait TV
    extends StObject
       with _Country
  inline def TV: TV = "TV".asInstanceOf[TV]
  
  @js.native
  sealed trait TW
    extends StObject
       with _Country
  inline def TW: TW = "TW".asInstanceOf[TW]
  
  @js.native
  sealed trait TZ
    extends StObject
       with _Country
  inline def TZ: TZ = "TZ".asInstanceOf[TZ]
  
  @js.native
  sealed trait TwoPersonDelivery
    extends StObject
       with LasershipAttrs
  inline def TwoPersonDelivery: TwoPersonDelivery = "TwoPersonDelivery".asInstanceOf[TwoPersonDelivery]
  
  @js.native
  sealed trait UA
    extends StObject
       with _Country
  inline def UA: UA = "UA".asInstanceOf[UA]
  
  @js.native
  sealed trait UG
    extends StObject
       with _Country
  inline def UG: UG = "UG".asInstanceOf[UG]
  
  @js.native
  sealed trait UM
    extends StObject
       with _Country
  inline def UM: UM = "UM".asInstanceOf[UM]
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with TrackingStatuses
  inline def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait UPS
    extends StObject
       with Provider
       with typings.shippo.mod.ShipmentExtras.Insurance.Provider
  inline def UPS: UPS = "UPS".asInstanceOf[UPS]
  
  @js.native
  sealed trait US
    extends StObject
       with _Country
  inline def US: US = "US".asInstanceOf[US]
  
  @js.native
  sealed trait UY
    extends StObject
       with _Country
  inline def UY: UY = "UY".asInstanceOf[UY]
  
  @js.native
  sealed trait UZ
    extends StObject
       with _Country
  inline def UZ: UZ = "UZ".asInstanceOf[UZ]
  
  @js.native
  sealed trait VA
    extends StObject
       with _Country
  inline def VA: VA = "VA".asInstanceOf[VA]
  
  @js.native
  sealed trait VALID
    extends StObject
       with ObjectState
       with typings.shippo.mod.Batch.Shipment.Status
       with typings.shippo.mod.Batch.Status
  inline def VALID: VALID = "VALID".asInstanceOf[VALID]
  
  @js.native
  sealed trait VALIDATING
    extends StObject
       with typings.shippo.mod.Batch.Status
  inline def VALIDATING: VALIDATING = "VALIDATING".asInstanceOf[VALIDATING]
  
  @js.native
  sealed trait VAT
    extends StObject
       with _Type
  inline def VAT: VAT = "VAT".asInstanceOf[VAT]
  
  @js.native
  sealed trait VC
    extends StObject
       with _Country
  inline def VC: VC = "VC".asInstanceOf[VC]
  
  @js.native
  sealed trait VE
    extends StObject
       with _Country
  inline def VE: VE = "VE".asInstanceOf[VE]
  
  @js.native
  sealed trait VG
    extends StObject
       with _Country
  inline def VG: VG = "VG".asInstanceOf[VG]
  
  @js.native
  sealed trait VI
    extends StObject
       with _Country
  inline def VI: VI = "VI".asInstanceOf[VI]
  
  @js.native
  sealed trait VN
    extends StObject
       with _Country
  inline def VN: VN = "VN".asInstanceOf[VN]
  
  @js.native
  sealed trait VU
    extends StObject
       with _Country
  inline def VU: VU = "VU".asInstanceOf[VU]
  
  @js.native
  sealed trait WAITING
    extends StObject
       with typings.shippo.mod.Transaction.Status
       with typings.shippo.mod.Shipment.Status
  inline def WAITING: WAITING = "WAITING".asInstanceOf[WAITING]
  
  @js.native
  sealed trait WF
    extends StObject
       with _Country
  inline def WF: WF = "WF".asInstanceOf[WF]
  
  @js.native
  sealed trait WS
    extends StObject
       with _Country
  inline def WS: WS = "WS".asInstanceOf[WS]
  
  @js.native
  sealed trait YE
    extends StObject
       with _Country
  inline def YE: YE = "YE".asInstanceOf[YE]
  
  @js.native
  sealed trait YT
    extends StObject
       with _Country
  inline def YT: YT = "YT".asInstanceOf[YT]
  
  @js.native
  sealed trait ZA
    extends StObject
       with _Country
  inline def ZA: ZA = "ZA".asInstanceOf[ZA]
  
  @js.native
  sealed trait ZM
    extends StObject
       with _Country
  inline def ZM: ZM = "ZM".asInstanceOf[ZM]
  
  @js.native
  sealed trait ZPLII
    extends StObject
       with LabelFileType
  inline def ZPLII: ZPLII = "ZPLII".asInstanceOf[ZPLII]
  
  @js.native
  sealed trait ZW
    extends StObject
       with _Country
  inline def ZW: ZW = "ZW".asInstanceOf[ZW]
  
  @js.native
  sealed trait cm_
    extends StObject
       with _DistanceUnit
  inline def cm_ : cm_ = "cm".asInstanceOf[cm_]
  
  @js.native
  sealed trait consumer
    extends StObject
       with RecipientType
  inline def consumer: consumer = "consumer".asInstanceOf[consumer]
  
  @js.native
  sealed trait creation_failed
    extends StObject
       with ObjectResult
  inline def creation_failed: creation_failed = "creation_failed".asInstanceOf[creation_failed]
  
  @js.native
  sealed trait creation_succeeded
    extends StObject
       with ObjectResult
  inline def creation_succeeded: creation_succeeded = "creation_succeeded".asInstanceOf[creation_succeeded]
  
  @js.native
  sealed trait fedex_
    extends StObject
       with _Carriers
  inline def fedex_ : fedex_ = "fedex".asInstanceOf[fedex_]
  
  @js.native
  sealed trait fedex_2_day
    extends StObject
       with _FEDEXServiceLevel
  inline def fedex_2_day: fedex_2_day = "fedex_2_day".asInstanceOf[fedex_2_day]
  
  @js.native
  sealed trait fedex_2_day_am
    extends StObject
       with _FEDEXServiceLevel
  inline def fedex_2_day_am: fedex_2_day_am = "fedex_2_day_am".asInstanceOf[fedex_2_day_am]
  
  @js.native
  sealed trait fedex_europe_first_international_priority
    extends StObject
       with _FEDEXServiceLevel
  inline def fedex_europe_first_international_priority: fedex_europe_first_international_priority = "fedex_europe_first_international_priority".asInstanceOf[fedex_europe_first_international_priority]
  
  @js.native
  sealed trait fedex_express_saver
    extends StObject
       with _FEDEXServiceLevel
  inline def fedex_express_saver: fedex_express_saver = "fedex_express_saver".asInstanceOf[fedex_express_saver]
  
  @js.native
  sealed trait fedex_first_freight
    extends StObject
       with _FEDEXServiceLevel
  inline def fedex_first_freight: fedex_first_freight = "fedex_first_freight".asInstanceOf[fedex_first_freight]
  
  @js.native
  sealed trait fedex_first_overnight
    extends StObject
       with _FEDEXServiceLevel
  inline def fedex_first_overnight: fedex_first_overnight = "fedex_first_overnight".asInstanceOf[fedex_first_overnight]
  
  @js.native
  sealed trait fedex_freight_economy
    extends StObject
       with _FEDEXServiceLevel
  inline def fedex_freight_economy: fedex_freight_economy = "fedex_freight_economy".asInstanceOf[fedex_freight_economy]
  
  @js.native
  sealed trait fedex_freight_priority
    extends StObject
       with _FEDEXServiceLevel
  inline def fedex_freight_priority: fedex_freight_priority = "fedex_freight_priority".asInstanceOf[fedex_freight_priority]
  
  @js.native
  sealed trait fedex_ground
    extends StObject
       with _FEDEXServiceLevel
  inline def fedex_ground: fedex_ground = "fedex_ground".asInstanceOf[fedex_ground]
  
  @js.native
  sealed trait fedex_home_delivery
    extends StObject
       with _FEDEXServiceLevel
  inline def fedex_home_delivery: fedex_home_delivery = "fedex_home_delivery".asInstanceOf[fedex_home_delivery]
  
  @js.native
  sealed trait fedex_international_economy
    extends StObject
       with _FEDEXServiceLevel
  inline def fedex_international_economy: fedex_international_economy = "fedex_international_economy".asInstanceOf[fedex_international_economy]
  
  @js.native
  sealed trait fedex_international_first
    extends StObject
       with _FEDEXServiceLevel
  inline def fedex_international_first: fedex_international_first = "fedex_international_first".asInstanceOf[fedex_international_first]
  
  @js.native
  sealed trait fedex_international_priority
    extends StObject
       with _FEDEXServiceLevel
  inline def fedex_international_priority: fedex_international_priority = "fedex_international_priority".asInstanceOf[fedex_international_priority]
  
  @js.native
  sealed trait fedex_next_day_freight
    extends StObject
       with _FEDEXServiceLevel
  inline def fedex_next_day_freight: fedex_next_day_freight = "fedex_next_day_freight".asInstanceOf[fedex_next_day_freight]
  
  @js.native
  sealed trait fedex_priority_overnight
    extends StObject
       with _FEDEXServiceLevel
  inline def fedex_priority_overnight: fedex_priority_overnight = "fedex_priority_overnight".asInstanceOf[fedex_priority_overnight]
  
  @js.native
  sealed trait fedex_smart_post
    extends StObject
       with _FEDEXServiceLevel
  inline def fedex_smart_post: fedex_smart_post = "fedex_smart_post".asInstanceOf[fedex_smart_post]
  
  @js.native
  sealed trait fedex_standard_overnight
    extends StObject
       with _FEDEXServiceLevel
  inline def fedex_standard_overnight: fedex_standard_overnight = "fedex_standard_overnight".asInstanceOf[fedex_standard_overnight]
  
  @js.native
  sealed trait ft
    extends StObject
       with _DistanceUnit
  inline def ft: ft = "ft".asInstanceOf[ft]
  
  @js.native
  sealed trait g
    extends StObject
       with _MassUnit
  inline def g: g = "g".asInstanceOf[g]
  
  @js.native
  sealed trait in_
    extends StObject
       with _DistanceUnit
  inline def in_ : in_ = "in".asInstanceOf[in_]
  
  @js.native
  sealed trait international_economy_freight
    extends StObject
       with _FEDEXServiceLevel
  inline def international_economy_freight: international_economy_freight = "international_economy_freight".asInstanceOf[international_economy_freight]
  
  @js.native
  sealed trait international_priority_freight
    extends StObject
       with _FEDEXServiceLevel
  inline def international_priority_freight: international_priority_freight = "international_priority_freight".asInstanceOf[international_priority_freight]
  
  @js.native
  sealed trait kg_
    extends StObject
       with _MassUnit
  inline def kg_ : kg_ = "kg".asInstanceOf[kg_]
  
  @js.native
  sealed trait lb_
    extends StObject
       with _MassUnit
  inline def lb_ : lb_ = "lb".asInstanceOf[lb_]
  
  @js.native
  sealed trait licensee
    extends StObject
       with RecipientType
  inline def licensee: licensee = "licensee".asInstanceOf[licensee]
  
  @js.native
  sealed trait m
    extends StObject
       with _DistanceUnit
  inline def m: m = "m".asInstanceOf[m]
  
  @js.native
  sealed trait mm_
    extends StObject
       with _DistanceUnit
  inline def mm_ : mm_ = "mm".asInstanceOf[mm_]
  
  @js.native
  sealed trait oz
    extends StObject
       with _MassUnit
  inline def oz: oz = "oz".asInstanceOf[oz]
  
  @js.native
  sealed trait purchase_failed
    extends StObject
       with ObjectResult
  inline def purchase_failed: purchase_failed = "purchase_failed".asInstanceOf[purchase_failed]
  
  @js.native
  sealed trait purchase_succeeded
    extends StObject
       with ObjectResult
  inline def purchase_succeeded: purchase_succeeded = "purchase_succeeded".asInstanceOf[purchase_succeeded]
  
  @js.native
  sealed trait ups_
    extends StObject
       with _Carriers
  inline def ups_ : ups_ = "ups".asInstanceOf[ups_]
  
  @js.native
  sealed trait ups_3_day_select
    extends StObject
       with _UPSServiceLevel
  inline def ups_3_day_select: ups_3_day_select = "ups_3_day_select".asInstanceOf[ups_3_day_select]
  
  @js.native
  sealed trait ups_access_point_economy
    extends StObject
       with _UPSServiceLevel
  inline def ups_access_point_economy: ups_access_point_economy = "ups_access_point_economy".asInstanceOf[ups_access_point_economy]
  
  @js.native
  sealed trait ups_expedited
    extends StObject
       with _UPSServiceLevel
  inline def ups_expedited: ups_expedited = "ups_expedited".asInstanceOf[ups_expedited]
  
  @js.native
  sealed trait ups_express
    extends StObject
       with _UPSServiceLevel
  inline def ups_express: ups_express = "ups_express".asInstanceOf[ups_express]
  
  @js.native
  sealed trait ups_express_1200
    extends StObject
       with _UPSServiceLevel
  inline def ups_express_1200: ups_express_1200 = "ups_express_1200".asInstanceOf[ups_express_1200]
  
  @js.native
  sealed trait ups_express_early
    extends StObject
       with _UPSServiceLevel
  inline def ups_express_early: ups_express_early = "ups_express_early".asInstanceOf[ups_express_early]
  
  @js.native
  sealed trait ups_express_plus
    extends StObject
       with _UPSServiceLevel
  inline def ups_express_plus: ups_express_plus = "ups_express_plus".asInstanceOf[ups_express_plus]
  
  @js.native
  sealed trait ups_ground
    extends StObject
       with _UPSServiceLevel
  inline def ups_ground: ups_ground = "ups_ground".asInstanceOf[ups_ground]
  
  @js.native
  sealed trait ups_mail_innovations_domestic
    extends StObject
       with _UPSServiceLevel
  inline def ups_mail_innovations_domestic: ups_mail_innovations_domestic = "ups_mail_innovations_domestic".asInstanceOf[ups_mail_innovations_domestic]
  
  @js.native
  sealed trait ups_next_day_air
    extends StObject
       with _UPSServiceLevel
  inline def ups_next_day_air: ups_next_day_air = "ups_next_day_air".asInstanceOf[ups_next_day_air]
  
  @js.native
  sealed trait ups_next_day_air_early_am
    extends StObject
       with _UPSServiceLevel
  inline def ups_next_day_air_early_am: ups_next_day_air_early_am = "ups_next_day_air_early_am".asInstanceOf[ups_next_day_air_early_am]
  
  @js.native
  sealed trait ups_next_day_air_saver
    extends StObject
       with _UPSServiceLevel
  inline def ups_next_day_air_saver: ups_next_day_air_saver = "ups_next_day_air_saver".asInstanceOf[ups_next_day_air_saver]
  
  @js.native
  sealed trait ups_saver
    extends StObject
       with _UPSServiceLevel
  inline def ups_saver: ups_saver = "ups_saver".asInstanceOf[ups_saver]
  
  @js.native
  sealed trait ups_second_day_air
    extends StObject
       with _UPSServiceLevel
  inline def ups_second_day_air: ups_second_day_air = "ups_second_day_air".asInstanceOf[ups_second_day_air]
  
  @js.native
  sealed trait ups_second_day_air_am
    extends StObject
       with _UPSServiceLevel
  inline def ups_second_day_air_am: ups_second_day_air_am = "ups_second_day_air_am".asInstanceOf[ups_second_day_air_am]
  
  @js.native
  sealed trait ups_standard
    extends StObject
       with _UPSServiceLevel
  inline def ups_standard: ups_standard = "ups_standard".asInstanceOf[ups_standard]
  
  @js.native
  sealed trait ups_surepost
    extends StObject
       with _UPSServiceLevel
  inline def ups_surepost: ups_surepost = "ups_surepost".asInstanceOf[ups_surepost]
  
  @js.native
  sealed trait ups_surepost_bound_printed_matter
    extends StObject
       with _UPSServiceLevel
  inline def ups_surepost_bound_printed_matter: ups_surepost_bound_printed_matter = "ups_surepost_bound_printed_matter".asInstanceOf[ups_surepost_bound_printed_matter]
  
  @js.native
  sealed trait ups_surepost_lightweight
    extends StObject
       with _UPSServiceLevel
  inline def ups_surepost_lightweight: ups_surepost_lightweight = "ups_surepost_lightweight".asInstanceOf[ups_surepost_lightweight]
  
  @js.native
  sealed trait ups_surepost_media
    extends StObject
       with _UPSServiceLevel
  inline def ups_surepost_media: ups_surepost_media = "ups_surepost_media".asInstanceOf[ups_surepost_media]
  
  @js.native
  sealed trait usps
    extends StObject
       with _Carriers
  inline def usps: usps = "usps".asInstanceOf[usps]
  
  @js.native
  sealed trait usps_first
    extends StObject
       with _USPSServiceLevel
  inline def usps_first: usps_first = "usps_first".asInstanceOf[usps_first]
  
  @js.native
  sealed trait usps_first_class_package_international_service
    extends StObject
       with _USPSServiceLevel
  inline def usps_first_class_package_international_service: usps_first_class_package_international_service = "usps_first_class_package_international_service".asInstanceOf[usps_first_class_package_international_service]
  
  @js.native
  sealed trait usps_media_mail
    extends StObject
       with _USPSServiceLevel
  inline def usps_media_mail: usps_media_mail = "usps_media_mail".asInstanceOf[usps_media_mail]
  
  @js.native
  sealed trait usps_parcel_select
    extends StObject
       with _USPSServiceLevel
  inline def usps_parcel_select: usps_parcel_select = "usps_parcel_select".asInstanceOf[usps_parcel_select]
  
  @js.native
  sealed trait usps_priority
    extends StObject
       with _USPSServiceLevel
  inline def usps_priority: usps_priority = "usps_priority".asInstanceOf[usps_priority]
  
  @js.native
  sealed trait usps_priority_express
    extends StObject
       with _USPSServiceLevel
  inline def usps_priority_express: usps_priority_express = "usps_priority_express".asInstanceOf[usps_priority_express]
  
  @js.native
  sealed trait usps_priority_mail_express_international
    extends StObject
       with _USPSServiceLevel
  inline def usps_priority_mail_express_international: usps_priority_mail_express_international = "usps_priority_mail_express_international".asInstanceOf[usps_priority_mail_express_international]
  
  @js.native
  sealed trait usps_priority_mail_international
    extends StObject
       with _USPSServiceLevel
  inline def usps_priority_mail_international: usps_priority_mail_international = "usps_priority_mail_international".asInstanceOf[usps_priority_mail_international]
  
  @js.native
  sealed trait yd
    extends StObject
       with _DistanceUnit
  inline def yd: yd = "yd".asInstanceOf[yd]
}
