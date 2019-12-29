organization := "org.scalablytyped"
name := "react-intl"
version := "3.10.0-818640"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-32adec",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "1.3.3-dc36b1",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "4.5.3-f29c78",
  "org.scalablytyped" %%% "formatjs__intl-unified-numberformat" % "3.0.0-577d97",
  "org.scalablytyped" %%% "formatjs__intl-utils" % "2.0.0-5ba995",
  "org.scalablytyped" %%% "intl-messageformat" % "7.7.5-d9df11",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "3.5.2-5d12d9",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-bfe2c5",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-73a5bc",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        