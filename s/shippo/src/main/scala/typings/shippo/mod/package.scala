package typings.shippo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BatchAddShipmentsRequest = js.Array[BatchShipmentCreateRequest]

type BatchRemoveShipmentsRequest = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.shippo.shippoStrings.fedex_
  - typings.shippo.shippoStrings.ups_
  - typings.shippo.shippoStrings.usps
  - java.lang.String
*/
type Carriers = _Carriers | String

/* Rewritten from type alias, can be one of: 
  - typings.shippo.shippoStrings.US
  - typings.shippo.shippoStrings.AF
  - typings.shippo.shippoStrings.AX
  - typings.shippo.shippoStrings.AL
  - typings.shippo.shippoStrings.DZ
  - typings.shippo.shippoStrings.AS
  - typings.shippo.shippoStrings.AD
  - typings.shippo.shippoStrings.AO
  - typings.shippo.shippoStrings.AI
  - typings.shippo.shippoStrings.AQ
  - typings.shippo.shippoStrings.AG
  - typings.shippo.shippoStrings.AR
  - typings.shippo.shippoStrings.AM
  - typings.shippo.shippoStrings.AW
  - typings.shippo.shippoStrings.AU
  - typings.shippo.shippoStrings.AT
  - typings.shippo.shippoStrings.AZ
  - typings.shippo.shippoStrings.BS
  - typings.shippo.shippoStrings.BH
  - typings.shippo.shippoStrings.BD
  - typings.shippo.shippoStrings.BB
  - typings.shippo.shippoStrings.BY
  - typings.shippo.shippoStrings.BE
  - typings.shippo.shippoStrings.BZ
  - typings.shippo.shippoStrings.BJ
  - typings.shippo.shippoStrings.BM
  - typings.shippo.shippoStrings.BT
  - typings.shippo.shippoStrings.BO
  - typings.shippo.shippoStrings.BQ
  - typings.shippo.shippoStrings.BA
  - typings.shippo.shippoStrings.BW
  - typings.shippo.shippoStrings.BV
  - typings.shippo.shippoStrings.BR
  - typings.shippo.shippoStrings.IO
  - typings.shippo.shippoStrings.BN
  - typings.shippo.shippoStrings.BG
  - typings.shippo.shippoStrings.BF
  - typings.shippo.shippoStrings.BI
  - typings.shippo.shippoStrings.KH
  - typings.shippo.shippoStrings.CM
  - typings.shippo.shippoStrings.CA
  - typings.shippo.shippoStrings.CV
  - typings.shippo.shippoStrings.KY
  - typings.shippo.shippoStrings.CF
  - typings.shippo.shippoStrings.TD
  - typings.shippo.shippoStrings.CL
  - typings.shippo.shippoStrings.CN
  - typings.shippo.shippoStrings.CX
  - typings.shippo.shippoStrings.CC
  - typings.shippo.shippoStrings.CO
  - typings.shippo.shippoStrings.KM
  - typings.shippo.shippoStrings.CG
  - typings.shippo.shippoStrings.CD
  - typings.shippo.shippoStrings.CK
  - typings.shippo.shippoStrings.CR
  - typings.shippo.shippoStrings.CI
  - typings.shippo.shippoStrings.HR
  - typings.shippo.shippoStrings.CU
  - typings.shippo.shippoStrings.CW
  - typings.shippo.shippoStrings.CY
  - typings.shippo.shippoStrings.CZ
  - typings.shippo.shippoStrings.DK
  - typings.shippo.shippoStrings.DJ
  - typings.shippo.shippoStrings.DM
  - typings.shippo.shippoStrings.DO
  - typings.shippo.shippoStrings.EC
  - typings.shippo.shippoStrings.EG
  - typings.shippo.shippoStrings.SV
  - typings.shippo.shippoStrings.GQ
  - typings.shippo.shippoStrings.ER
  - typings.shippo.shippoStrings.EE
  - typings.shippo.shippoStrings.ET
  - typings.shippo.shippoStrings.FK
  - typings.shippo.shippoStrings.FO
  - typings.shippo.shippoStrings.FJ
  - typings.shippo.shippoStrings.FI
  - typings.shippo.shippoStrings.FR
  - typings.shippo.shippoStrings.GF
  - typings.shippo.shippoStrings.PF
  - typings.shippo.shippoStrings.TF
  - typings.shippo.shippoStrings.GA
  - typings.shippo.shippoStrings.GM
  - typings.shippo.shippoStrings.GE
  - typings.shippo.shippoStrings.DE
  - typings.shippo.shippoStrings.GH
  - typings.shippo.shippoStrings.GI
  - typings.shippo.shippoStrings.GR
  - typings.shippo.shippoStrings.GL
  - typings.shippo.shippoStrings.GD
  - typings.shippo.shippoStrings.GP
  - typings.shippo.shippoStrings.GU
  - typings.shippo.shippoStrings.GT
  - typings.shippo.shippoStrings.GG
  - typings.shippo.shippoStrings.GN
  - typings.shippo.shippoStrings.GW
  - typings.shippo.shippoStrings.GY
  - typings.shippo.shippoStrings.HT
  - typings.shippo.shippoStrings.HM
  - typings.shippo.shippoStrings.VA
  - typings.shippo.shippoStrings.HN
  - typings.shippo.shippoStrings.HK
  - typings.shippo.shippoStrings.HU
  - typings.shippo.shippoStrings.IS
  - typings.shippo.shippoStrings.IN
  - typings.shippo.shippoStrings.ID
  - typings.shippo.shippoStrings.IR
  - typings.shippo.shippoStrings.IQ
  - typings.shippo.shippoStrings.IE
  - typings.shippo.shippoStrings.IM
  - typings.shippo.shippoStrings.IL
  - typings.shippo.shippoStrings.IT
  - typings.shippo.shippoStrings.JM
  - typings.shippo.shippoStrings.JP
  - typings.shippo.shippoStrings.JE
  - typings.shippo.shippoStrings.JO
  - typings.shippo.shippoStrings.KZ
  - typings.shippo.shippoStrings.KE
  - typings.shippo.shippoStrings.KI
  - typings.shippo.shippoStrings.KR
  - typings.shippo.shippoStrings.KP
  - typings.shippo.shippoStrings.KW
  - typings.shippo.shippoStrings.KG
  - typings.shippo.shippoStrings.LA
  - typings.shippo.shippoStrings.LV
  - typings.shippo.shippoStrings.LB
  - typings.shippo.shippoStrings.LS
  - typings.shippo.shippoStrings.LR
  - typings.shippo.shippoStrings.LY
  - typings.shippo.shippoStrings.LI
  - typings.shippo.shippoStrings.LT
  - typings.shippo.shippoStrings.LU
  - typings.shippo.shippoStrings.MO
  - typings.shippo.shippoStrings.MK
  - typings.shippo.shippoStrings.MG
  - typings.shippo.shippoStrings.MW
  - typings.shippo.shippoStrings.MY
  - typings.shippo.shippoStrings.MV
  - typings.shippo.shippoStrings.ML
  - typings.shippo.shippoStrings.MT
  - typings.shippo.shippoStrings.MH
  - typings.shippo.shippoStrings.MQ
  - typings.shippo.shippoStrings.MR
  - typings.shippo.shippoStrings.MU
  - typings.shippo.shippoStrings.YT
  - typings.shippo.shippoStrings.MX
  - typings.shippo.shippoStrings.FM
  - typings.shippo.shippoStrings.MD
  - typings.shippo.shippoStrings.MC
  - typings.shippo.shippoStrings.MN
  - typings.shippo.shippoStrings.ME
  - typings.shippo.shippoStrings.MS
  - typings.shippo.shippoStrings.MA
  - typings.shippo.shippoStrings.MZ
  - typings.shippo.shippoStrings.MM
  - typings.shippo.shippoStrings.NA
  - typings.shippo.shippoStrings.NR
  - typings.shippo.shippoStrings.NP
  - typings.shippo.shippoStrings.NL
  - typings.shippo.shippoStrings.NC
  - typings.shippo.shippoStrings.NZ
  - typings.shippo.shippoStrings.NI
  - typings.shippo.shippoStrings.NE
  - typings.shippo.shippoStrings.NG
  - typings.shippo.shippoStrings.NU
  - typings.shippo.shippoStrings.NF
  - typings.shippo.shippoStrings.MP
  - typings.shippo.shippoStrings.NO
  - typings.shippo.shippoStrings.OM
  - typings.shippo.shippoStrings.PK
  - typings.shippo.shippoStrings.PW
  - typings.shippo.shippoStrings.PS
  - typings.shippo.shippoStrings.PA
  - typings.shippo.shippoStrings.PG
  - typings.shippo.shippoStrings.PY
  - typings.shippo.shippoStrings.PE
  - typings.shippo.shippoStrings.PH
  - typings.shippo.shippoStrings.PN
  - typings.shippo.shippoStrings.PL
  - typings.shippo.shippoStrings.PT
  - typings.shippo.shippoStrings.PR
  - typings.shippo.shippoStrings.QA
  - typings.shippo.shippoStrings.RE
  - typings.shippo.shippoStrings.RO
  - typings.shippo.shippoStrings.RU
  - typings.shippo.shippoStrings.RW
  - typings.shippo.shippoStrings.BL
  - typings.shippo.shippoStrings.SH
  - typings.shippo.shippoStrings.KN
  - typings.shippo.shippoStrings.LC
  - typings.shippo.shippoStrings.MF
  - typings.shippo.shippoStrings.PM
  - typings.shippo.shippoStrings.VC
  - typings.shippo.shippoStrings.WS
  - typings.shippo.shippoStrings.SM
  - typings.shippo.shippoStrings.ST
  - typings.shippo.shippoStrings.SA
  - typings.shippo.shippoStrings.SN
  - typings.shippo.shippoStrings.RS
  - typings.shippo.shippoStrings.SC
  - typings.shippo.shippoStrings.SL
  - typings.shippo.shippoStrings.SG
  - typings.shippo.shippoStrings.SX
  - typings.shippo.shippoStrings.SK
  - typings.shippo.shippoStrings.SI
  - typings.shippo.shippoStrings.SB
  - typings.shippo.shippoStrings.SO
  - typings.shippo.shippoStrings.ZA
  - typings.shippo.shippoStrings.GS
  - typings.shippo.shippoStrings.SS
  - typings.shippo.shippoStrings.ES
  - typings.shippo.shippoStrings.LK
  - typings.shippo.shippoStrings.SD
  - typings.shippo.shippoStrings.SR
  - typings.shippo.shippoStrings.SJ
  - typings.shippo.shippoStrings.SZ
  - typings.shippo.shippoStrings.SE
  - typings.shippo.shippoStrings.CH
  - typings.shippo.shippoStrings.SY
  - typings.shippo.shippoStrings.TW
  - typings.shippo.shippoStrings.TJ
  - typings.shippo.shippoStrings.TZ
  - typings.shippo.shippoStrings.TH
  - typings.shippo.shippoStrings.TL
  - typings.shippo.shippoStrings.TG
  - typings.shippo.shippoStrings.TK
  - typings.shippo.shippoStrings.TO
  - typings.shippo.shippoStrings.TT
  - typings.shippo.shippoStrings.TN
  - typings.shippo.shippoStrings.TR
  - typings.shippo.shippoStrings.TM
  - typings.shippo.shippoStrings.TC
  - typings.shippo.shippoStrings.TV
  - typings.shippo.shippoStrings.UG
  - typings.shippo.shippoStrings.UA
  - typings.shippo.shippoStrings.AE
  - typings.shippo.shippoStrings.GB
  - typings.shippo.shippoStrings.UM
  - typings.shippo.shippoStrings.UY
  - typings.shippo.shippoStrings.UZ
  - typings.shippo.shippoStrings.VU
  - typings.shippo.shippoStrings.VE
  - typings.shippo.shippoStrings.VN
  - typings.shippo.shippoStrings.VG
  - typings.shippo.shippoStrings.VI
  - typings.shippo.shippoStrings.WF
  - typings.shippo.shippoStrings.EH
  - typings.shippo.shippoStrings.YE
  - typings.shippo.shippoStrings.ZM
  - typings.shippo.shippoStrings.ZW
  - java.lang.String
*/
type Country = _Country | String

/* Rewritten from type alias, can be one of: 
  - typings.shippo.shippoStrings.cm_
  - typings.shippo.shippoStrings.in_
  - typings.shippo.shippoStrings.ft
  - typings.shippo.shippoStrings.mm_
  - typings.shippo.shippoStrings.m
  - typings.shippo.shippoStrings.yd
  - java.lang.String
*/
type DistanceUnit = _DistanceUnit | String

/* Rewritten from type alias, can be one of: 
  - typings.shippo.shippoStrings.fedex_ground
  - typings.shippo.shippoStrings.fedex_home_delivery
  - typings.shippo.shippoStrings.fedex_smart_post
  - typings.shippo.shippoStrings.fedex_2_day
  - typings.shippo.shippoStrings.fedex_2_day_am
  - typings.shippo.shippoStrings.fedex_express_saver
  - typings.shippo.shippoStrings.fedex_standard_overnight
  - typings.shippo.shippoStrings.fedex_priority_overnight
  - typings.shippo.shippoStrings.fedex_first_overnight
  - typings.shippo.shippoStrings.fedex_freight_priority
  - typings.shippo.shippoStrings.fedex_next_day_freight
  - typings.shippo.shippoStrings.fedex_freight_economy
  - typings.shippo.shippoStrings.fedex_first_freight
  - typings.shippo.shippoStrings.fedex_international_economy
  - typings.shippo.shippoStrings.fedex_international_priority
  - typings.shippo.shippoStrings.fedex_international_first
  - typings.shippo.shippoStrings.fedex_europe_first_international_priority
  - typings.shippo.shippoStrings.international_economy_freight
  - typings.shippo.shippoStrings.international_priority_freight
  - java.lang.String
*/
type FEDEXServiceLevel = _FEDEXServiceLevel | String

/* Rewritten from type alias, can be one of: 
  - typings.shippo.shippoStrings.g
  - typings.shippo.shippoStrings.oz
  - typings.shippo.shippoStrings.lb_
  - typings.shippo.shippoStrings.kg_
  - java.lang.String
*/
type MassUnit = _MassUnit | String

/* Rewritten from type alias, can be one of: 
  - typings.shippo.mod.USPSServiceLevel
  - typings.shippo.mod.UPSServiceLevel
  - typings.shippo.mod.FEDEXServiceLevel
*/
type ServiceLevels = _ServiceLevels | String

/* Rewritten from type alias, can be one of: 
  - typings.shippo.shippoStrings.ups_standard
  - typings.shippo.shippoStrings.ups_ground
  - typings.shippo.shippoStrings.ups_saver
  - typings.shippo.shippoStrings.ups_3_day_select
  - typings.shippo.shippoStrings.ups_second_day_air
  - typings.shippo.shippoStrings.ups_second_day_air_am
  - typings.shippo.shippoStrings.ups_next_day_air
  - typings.shippo.shippoStrings.ups_next_day_air_saver
  - typings.shippo.shippoStrings.ups_next_day_air_early_am
  - typings.shippo.shippoStrings.ups_mail_innovations_domestic
  - typings.shippo.shippoStrings.ups_surepost
  - typings.shippo.shippoStrings.ups_surepost_bound_printed_matter
  - typings.shippo.shippoStrings.ups_surepost_lightweight
  - typings.shippo.shippoStrings.ups_surepost_media
  - typings.shippo.shippoStrings.ups_express
  - typings.shippo.shippoStrings.ups_express_1200
  - typings.shippo.shippoStrings.ups_express_plus
  - typings.shippo.shippoStrings.ups_expedited
  - typings.shippo.shippoStrings.ups_express_early
  - typings.shippo.shippoStrings.ups_access_point_economy
  - java.lang.String
*/
type UPSServiceLevel = _UPSServiceLevel | String

/* Rewritten from type alias, can be one of: 
  - typings.shippo.shippoStrings.usps_priority
  - typings.shippo.shippoStrings.usps_priority_express
  - typings.shippo.shippoStrings.usps_first
  - typings.shippo.shippoStrings.usps_parcel_select
  - typings.shippo.shippoStrings.usps_media_mail
  - typings.shippo.shippoStrings.usps_priority_mail_international
  - typings.shippo.shippoStrings.usps_priority_mail_express_international
  - typings.shippo.shippoStrings.usps_first_class_package_international_service
  - java.lang.String
*/
type USPSServiceLevel = _USPSServiceLevel | String
