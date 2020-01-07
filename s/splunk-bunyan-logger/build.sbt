organization := "org.scalablytyped"
name := "splunk-bunyan-logger"
version := "0.9-dt-20180705Z-0ed271"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-04ae87",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-3beb6a",
  "org.scalablytyped" %%% "form-data" % "2.5.1-3a2873",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "request" % "2.48-dt-20191217Z-2da72e",
  "org.scalablytyped" %%% "splunk-logging" % "0.9-dt-20180705Z-8bf9ff",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20191206Z-1961cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        